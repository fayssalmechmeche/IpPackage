package IpPackage;

public class IpPackage {

	public IpPackage(int oct1, int oct2, int oct3, int oct4) {
		octet1 = oct1;
		octet2 = oct2;
		octet3 = oct3;
		octet4 = oct4;
	}

	public static IpPackage getInstance(int oct1, int oct2, int oct3, int oct4) {
		try {
			if (oct1 < 0 || oct1 > 255 || oct2 < 0 || oct2 > 255 || oct3 < 0 || oct3 > 255 || oct4 < 0 || oct4 > 255) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("Ceci n'est pas une adresse IP.");
		}

		return new IpPackage(oct1, oct2, oct3, oct4);
	}

	public String getClasse() {
		if (octet1 <= 127) {
			return "A";
		}
		if ((octet1 >= 128 && octet1 <= 191)) {
			return "B";
		}
		if ((octet1 >= 192) && (octet1 <= 223)) {
			return "C";
		}
		if ((octet1 >= 224) && (octet1 <= 239)) {
			return "D";
		}
		if ((octet1 >= 240) && (octet1 <= 255)) {
			return "E";
		} else {
			return "La classe d'IP est introuvable.";
		}
	}

	public IpPackage adresseReseau() {
		int o1, o2, o3, o4;

		try {
			if (octet1 < 0 || octet1 > 255 || octet2 < 0 || octet2 > 255 || octet3 < 0
					|| octet3 > 255 || octet4 < 0 || octet4 > 255) {
				throw new Exception();
			}
		}

		catch (Exception e) {
			System.out.println("La classe réseau de cette adresse IP est introuvable");
		}

		if (octet1 <= 127) {
			o1 = octet1;
			o2 = 0;
			o3 = 0;
			o4 = 0;
			return new IpPackage(octet1, octet2, octet3, octet4);
		}
		if ((octet1 >= 128) && (octet1 <= 191)) {
			o1 = octet1;
			o2 = octet2;
			o3 = 0;
			o4 = 0;
			return new IpPackage(o1, o2, o3, o4);
		}
		if ((octet1 >= 192) && (octet1 <= 223)) {
			o1 = octet1;
			o2 = octet2;
			o3 = octet3;
			o4 = 0;
			return new IpPackage(o1, o2, o3, o4);
		} else {
			return new IpPackage(octet1, octet2, octet3, octet4);
		}
	}

	public boolean estMemeReseau(IpPackage y) {
		if (octet1 == y.getOctet1()) {
			if (octet2 == y.getOctet2()) {
				if (octet3 == y.getOctet3()) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int getOctet1() {
		return octet1;
	}

	public int getOctet2() {
		return octet2;
	}

	public int getOctet3() {
		return octet3;
	}

	public int getOctet4() {
		return octet4;
	}

	public String toString() {
		return octet1 + "," + octet2 + "," + octet3 + "," + octet4;
	}

	public String toBinary() {
		ip1octet1 = Integer.toBinaryString(octet1);
		ip1octet2 = Integer.toBinaryString(octet2);
		ip1octet3 = Integer.toBinaryString(octet3);
		ip1octet4 = Integer.toBinaryString(octet4);
		ip2octet1 = Integer.toBinaryString(octet1);
		ip2octet2 = Integer.toBinaryString(octet2);
		ip2octet3 = Integer.toBinaryString(octet3);
		ip2octet4 = Integer.toBinaryString(octet4);
		ip3octet1 = Integer.toBinaryString(octet1);
		ip3octet2 = Integer.toBinaryString(octet2);
		ip3octet3 = Integer.toBinaryString(octet3);
		ip3octet4 = Integer.toBinaryString(octet4);
		ip4octet1 = Integer.toBinaryString(octet1);
		ip4octet2 = Integer.toBinaryString(octet2);
		ip4octet3 = Integer.toBinaryString(octet3);
		ip4octet4 = Integer.toBinaryString(octet4);
		return ip1octet1 + "," + ip1octet2 + "," + ip1octet3 + "," + ip1octet4 + "," + ip2octet1 + "," + ip2octet2 + ","
				+ ip2octet3 + "," + ip2octet4 + "," + ip3octet1 + "," + ip3octet2 + "," + ip3octet3 + "," + ip3octet4
				+ "," + ip4octet1 + "," + ip4octet2 + "," + ip4octet3 + "," + ip4octet4 + ",";

	}

	public String toHexadecimal() {
		ip1octet1 = Integer.toHexString(octet1);
		ip1octet2 = Integer.toHexString(octet2);
		ip1octet3 = Integer.toHexString(octet3);
		ip1octet4 = Integer.toHexString(octet4);
		ip2octet1 = Integer.toHexString(octet1);
		ip2octet2 = Integer.toHexString(octet2);
		ip2octet3 = Integer.toHexString(octet3);
		ip2octet4 = Integer.toHexString(octet4);
		ip3octet1 = Integer.toHexString(octet1);
		ip3octet2 = Integer.toHexString(octet2);
		ip3octet3 = Integer.toHexString(octet3);
		ip3octet4 = Integer.toHexString(octet4);
		ip4octet1 = Integer.toHexString(octet1);
		ip4octet2 = Integer.toHexString(octet2);
		ip4octet3 = Integer.toHexString(octet3);
		ip4octet4 = Integer.toHexString(octet4);
		return ip1octet1 + "," + ip1octet2 + "," + ip1octet3 + "," + ip1octet4 + "," + ip2octet1 + "," + ip2octet2 + ","
				+ ip2octet3 + "," + ip2octet4 + "," + ip3octet1 + "," + ip3octet2 + "," + ip3octet3 + "," + ip3octet4
				+ "," + ip4octet1 + "," + ip4octet2 + "," + ip4octet3 + "," + ip4octet4 + ",";
	
	}

	private int octet1;
	private int octet2;
	private int octet3;
	private int octet4;
	private String ip1octet1;
	private String ip1octet2;
	private String ip1octet3;
	private String ip1octet4;
	private String ip2octet1;
	private String ip2octet2;
	private String ip2octet3;
	private String ip2octet4;
	private String ip3octet1;
	private String ip3octet2;
	private String ip3octet3;
	private String ip3octet4;
	private String ip4octet1;
	private String ip4octet2;
	private String ip4octet3;
	private String ip4octet4;
	
}