package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ddz extends czr {
    public static final czv A;
    public static final czv B;
    public static final czv C;
    public static final czv D;
    public static final czv E;
    public static final czv F;
    public static final czv G;
    public static final Hashtable H;
    public static final Hashtable I;
    public static final Hashtable J;
    public static final Hashtable K;
    private static final Boolean L;
    private static final Boolean M;
    public static final czv a;
    public static final czv b;
    public static final czv c;
    public static final czv d;
    public static final czv e;
    public static final czv f;
    public static final czv g;
    public static final czv h;
    public static final czv i;
    public static final czv j;
    public static final czv k;
    public static final czv l;
    public static final czv m;
    public static final czv n;
    public static final czv o;
    public static final czv p;
    public static final czv q;
    public static final czv r;
    public static final czv s;
    public static final czv t;
    public static final czv u;
    public static final czv v;
    public static final czv w;
    public static final czv x;
    public static final czv y;
    public static final czv z;
    private Vector N = new Vector();
    private Vector O = new Vector();
    private Vector P = new Vector();
    private dag Q;
    private boolean R;
    private int S;

    static {
        czv czvVar = new czv("2.5.4.6");
        a = czvVar;
        czv czvVar2 = new czv("2.5.4.10");
        b = czvVar2;
        czv czvVar3 = new czv("2.5.4.11");
        c = czvVar3;
        czv czvVar4 = new czv("2.5.4.12");
        d = czvVar4;
        czv czvVar5 = new czv("2.5.4.3");
        e = czvVar5;
        czv czvVar6 = new czv("2.5.4.5");
        f = czvVar6;
        czv czvVar7 = new czv("2.5.4.9");
        g = czvVar7;
        czv czvVar8 = new czv("2.5.4.7");
        h = czvVar8;
        czv czvVar9 = new czv("2.5.4.8");
        i = czvVar9;
        czv czvVar10 = new czv("2.5.4.4");
        j = czvVar10;
        czv czvVar11 = new czv("2.5.4.42");
        k = czvVar11;
        czv czvVar12 = new czv("2.5.4.43");
        l = czvVar12;
        czv czvVar13 = new czv("2.5.4.44");
        m = czvVar13;
        czv czvVar14 = new czv("2.5.4.45");
        n = czvVar14;
        czv czvVar15 = new czv("2.5.4.15");
        o = czvVar15;
        czv czvVar16 = new czv("2.5.4.17");
        p = czvVar16;
        czv czvVar17 = new czv("2.5.4.46");
        q = czvVar17;
        czv czvVar18 = new czv("2.5.4.65");
        r = czvVar18;
        czv czvVar19 = new czv("1.3.6.1.5.5.7.9.1");
        s = czvVar19;
        czv czvVar20 = new czv("1.3.6.1.5.5.7.9.2");
        t = czvVar20;
        czv czvVar21 = new czv("1.3.6.1.5.5.7.9.3");
        u = czvVar21;
        czv czvVar22 = new czv("1.3.6.1.5.5.7.9.4");
        v = czvVar22;
        czv czvVar23 = new czv("1.3.6.1.5.5.7.9.5");
        w = czvVar23;
        czv czvVar24 = new czv("1.3.36.8.3.14");
        x = czvVar24;
        czv czvVar25 = new czv("2.5.4.16");
        y = czvVar25;
        new czv("2.5.4.54");
        czv czvVar26 = dea.a;
        z = czvVar26;
        czv czvVar27 = dea.b;
        A = czvVar27;
        czv czvVar28 = dci.u;
        B = czvVar28;
        czv czvVar29 = dci.v;
        C = czvVar29;
        czv czvVar30 = dci.w;
        D = czvVar30;
        E = czvVar28;
        czv czvVar31 = new czv("0.9.2342.19200300.100.1.25");
        F = czvVar31;
        czv czvVar32 = new czv("0.9.2342.19200300.100.1.1");
        G = czvVar32;
        Hashtable hashtable = new Hashtable();
        H = hashtable;
        Hashtable hashtable2 = new Hashtable();
        I = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        J = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        K = hashtable4;
        L = new Boolean(true);
        M = new Boolean(false);
        hashtable.put(czvVar, "C");
        hashtable.put(czvVar2, "O");
        hashtable.put(czvVar4, "T");
        hashtable.put(czvVar3, "OU");
        hashtable.put(czvVar5, "CN");
        hashtable.put(czvVar8, "L");
        hashtable.put(czvVar9, "ST");
        hashtable.put(czvVar6, "SERIALNUMBER");
        hashtable.put(czvVar28, "E");
        hashtable.put(czvVar31, "DC");
        hashtable.put(czvVar32, "UID");
        hashtable.put(czvVar7, "STREET");
        hashtable.put(czvVar10, "SURNAME");
        hashtable.put(czvVar11, "GIVENNAME");
        hashtable.put(czvVar12, "INITIALS");
        hashtable.put(czvVar13, "GENERATION");
        hashtable.put(czvVar30, "unstructuredAddress");
        hashtable.put(czvVar29, "unstructuredName");
        hashtable.put(czvVar14, "UniqueIdentifier");
        hashtable.put(czvVar17, "DN");
        hashtable.put(czvVar18, "Pseudonym");
        hashtable.put(czvVar25, "PostalAddress");
        hashtable.put(czvVar24, "NameAtBirth");
        hashtable.put(czvVar22, "CountryOfCitizenship");
        hashtable.put(czvVar23, "CountryOfResidence");
        hashtable.put(czvVar21, "Gender");
        hashtable.put(czvVar20, "PlaceOfBirth");
        hashtable.put(czvVar19, "DateOfBirth");
        hashtable.put(czvVar16, "PostalCode");
        hashtable.put(czvVar15, "BusinessCategory");
        hashtable.put(czvVar26, "TelephoneNumber");
        hashtable.put(czvVar27, "Name");
        hashtable2.put(czvVar, "C");
        hashtable2.put(czvVar2, "O");
        hashtable2.put(czvVar3, "OU");
        hashtable2.put(czvVar5, "CN");
        hashtable2.put(czvVar8, "L");
        hashtable2.put(czvVar9, "ST");
        hashtable2.put(czvVar7, "STREET");
        hashtable2.put(czvVar31, "DC");
        hashtable2.put(czvVar32, "UID");
        hashtable3.put(czvVar, "C");
        hashtable3.put(czvVar2, "O");
        hashtable3.put(czvVar3, "OU");
        hashtable3.put(czvVar5, "CN");
        hashtable3.put(czvVar8, "L");
        hashtable3.put(czvVar9, "ST");
        hashtable3.put(czvVar7, "STREET");
        hashtable4.put("c", czvVar);
        hashtable4.put("o", czvVar2);
        hashtable4.put("t", czvVar4);
        hashtable4.put("ou", czvVar3);
        hashtable4.put("cn", czvVar5);
        hashtable4.put("l", czvVar8);
        hashtable4.put("st", czvVar9);
        hashtable4.put("sn", czvVar6);
        hashtable4.put("serialnumber", czvVar6);
        hashtable4.put("street", czvVar7);
        hashtable4.put("emailaddress", czvVar28);
        hashtable4.put("dc", czvVar31);
        hashtable4.put("e", czvVar28);
        hashtable4.put("uid", czvVar32);
        hashtable4.put("surname", czvVar10);
        hashtable4.put("givenname", czvVar11);
        hashtable4.put("initials", czvVar12);
        hashtable4.put("generation", czvVar13);
        hashtable4.put("unstructuredaddress", czvVar30);
        hashtable4.put("unstructuredname", czvVar29);
        hashtable4.put("uniqueidentifier", czvVar14);
        hashtable4.put("dn", czvVar17);
        hashtable4.put("pseudonym", czvVar18);
        hashtable4.put("postaladdress", czvVar25);
        hashtable4.put("nameofbirth", czvVar24);
        hashtable4.put("countryofcitizenship", czvVar22);
        hashtable4.put("countryofresidence", czvVar23);
        hashtable4.put("gender", czvVar21);
        hashtable4.put("placeofbirth", czvVar20);
        hashtable4.put("dateofbirth", czvVar19);
        hashtable4.put("postalcode", czvVar16);
        hashtable4.put("businesscategory", czvVar15);
        hashtable4.put("telephonenumber", czvVar26);
        hashtable4.put("name", czvVar27);
    }

    protected ddz() {
    }

    private static final void a(StringBuffer stringBuffer, Hashtable hashtable, czv czvVar, String str) {
        String str2 = (String) hashtable.get(czvVar);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(czvVar.b());
        }
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            char cCharAt = stringBuffer.charAt(length);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    private static final String b(String str) {
        String strB = doj.b(str.trim());
        if (strB.length() > 0 && strB.charAt(0) == '#') {
            try {
                czb czbVarV = dab.v(dop.f(strB, strB.length() - 1));
                if (czbVarV instanceof daj) {
                    return doj.b(((daj) czbVarV).b().trim());
                }
            } catch (IOException e2) {
                throw new IllegalStateException("unknown encoding in name: ".concat(e2.toString()));
            }
        }
        return strB;
    }

    private static final String c(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i2 = 1;
            while (i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i2++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bc, code lost:
    
        r3[r9] = true;
        r4 = r4 + r6;
     */
    @Override // defpackage.czr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 1
            if (r14 != r13) goto L4
            return r0
        L4:
            boolean r1 = r14 instanceof defpackage.ddz
            r2 = 0
            if (r1 != 0) goto Lf
            boolean r3 = r14 instanceof defpackage.dag
            if (r3 == 0) goto Le
            goto Lf
        Le:
            return r2
        Lf:
            r3 = r14
            czb r3 = (defpackage.czb) r3
            dab r3 = r3.p()
            dab r4 = r13.p()
            boolean r3 = r4.w(r3)
            if (r3 != 0) goto Lc6
            if (r1 == 0) goto L25
            ddz r14 = (defpackage.ddz) r14     // Catch: java.lang.IllegalArgumentException -> Lc5
            goto L45
        L25:
            boolean r1 = r14 instanceof defpackage.dcp     // Catch: java.lang.IllegalArgumentException -> Lc5
            if (r1 == 0) goto L37
            ddz r1 = new ddz     // Catch: java.lang.IllegalArgumentException -> Lc5
            dcp r14 = (defpackage.dcp) r14     // Catch: java.lang.IllegalArgumentException -> Lc5
            dbk r14 = r14.a     // Catch: java.lang.IllegalArgumentException -> Lc5
            dag r14 = defpackage.dag.j(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            r1.<init>(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            goto L42
        L37:
            if (r14 == 0) goto L44
            ddz r1 = new ddz     // Catch: java.lang.IllegalArgumentException -> Lc5
            dag r14 = defpackage.dag.j(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            r1.<init>(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
        L42:
            r14 = r1
            goto L45
        L44:
            r14 = 0
        L45:
            java.util.Vector r1 = r13.N
            int r1 = r1.size()
            java.util.Vector r3 = r14.N
            int r3 = r3.size()
            if (r1 == r3) goto L54
            return r2
        L54:
            boolean[] r3 = new boolean[r1]
            java.util.Vector r4 = r13.N
            java.lang.Object r4 = r4.elementAt(r2)
            java.util.Vector r5 = r14.N
            java.lang.Object r5 = r5.elementAt(r2)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L6c
            r6 = r0
            r5 = r1
            r4 = r2
            goto L70
        L6c:
            int r4 = r1 + (-1)
            r5 = -1
            r6 = r5
        L70:
            if (r4 == r5) goto Lc4
            java.util.Vector r7 = r13.N
            java.lang.Object r7 = r7.elementAt(r4)
            czv r7 = (defpackage.czv) r7
            java.util.Vector r8 = r13.O
            java.lang.Object r8 = r8.elementAt(r4)
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
        L83:
            if (r9 >= r1) goto Lc3
            boolean r10 = r3[r9]
            if (r10 == 0) goto L8a
            goto Lc0
        L8a:
            java.util.Vector r10 = r14.N
            java.lang.Object r10 = r10.elementAt(r9)
            czv r10 = (defpackage.czv) r10
            boolean r10 = r7.w(r10)
            if (r10 == 0) goto Lc0
            java.util.Vector r10 = r14.O
            java.lang.Object r10 = r10.elementAt(r9)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = b(r8)
            java.lang.String r10 = b(r10)
            boolean r12 = r11.equals(r10)
            if (r12 != 0) goto Lbc
            java.lang.String r11 = c(r11)
            java.lang.String r10 = c(r10)
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto Lc0
        Lbc:
            r3[r9] = r0
            int r4 = r4 + r6
            goto L70
        Lc0:
            int r9 = r9 + 1
            goto L83
        Lc3:
            return r2
        Lc4:
            return r0
        Lc5:
            return r2
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddz.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.czr
    public final int hashCode() {
        if (!this.R) {
            this.R = true;
            for (int i2 = 0; i2 != this.N.size(); i2++) {
                String strC = c(b((String) this.O.elementAt(i2)));
                int iHashCode = this.S ^ this.N.elementAt(i2).hashCode();
                this.S = iHashCode;
                this.S = strC.hashCode() ^ iHashCode;
            }
        }
        return this.S;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        if (this.Q == null) {
            czc czcVar = new czc();
            czc czcVar2 = new czc();
            if (this.N.size() != 0) {
                new czc(2).b((czv) this.N.elementAt(0));
                throw null;
            }
            czcVar.b(new dbl(czcVar2));
            this.Q = new dbk(czcVar);
        }
        return this.Q;
    }

    public final String toString() {
        Hashtable hashtable = H;
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            if (((Boolean) this.P.elementAt(i2)).booleanValue()) {
                stringBuffer2.append('+');
                a(stringBuffer2, hashtable, (czv) this.N.elementAt(i2), (String) this.O.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                a(stringBuffer2, hashtable, (czv) this.N.elementAt(i2), (String) this.O.elementAt(i2));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z2 = true;
        int i3 = 0;
        while (i3 < vector.size()) {
            if (!z2) {
                stringBuffer.append(',');
            }
            stringBuffer.append(vector.elementAt(i3).toString());
            i3++;
            z2 = false;
        }
        return stringBuffer.toString();
    }

    public ddz(dag dagVar) {
        this.Q = dagVar;
        Enumeration enumerationF = dagVar.f();
        while (enumerationF.hasMoreElements()) {
            dai daiVarG = dai.g(((czb) enumerationF.nextElement()).p());
            int i2 = 0;
            while (i2 < daiVarG.b()) {
                dag dagVarJ = dag.j(daiVarG.f(i2).p());
                if (dagVarJ.b() == 2) {
                    this.N.addElement(czv.h(dagVarJ.h(0)));
                    czb czbVarH = dagVarJ.h(1);
                    if ((czbVarH instanceof daj) && !(czbVarH instanceof dap)) {
                        String strB = ((daj) czbVarH).b();
                        if (strB.length() > 0 && strB.charAt(0) == '#') {
                            this.O.addElement("\\".concat(strB));
                        } else {
                            this.O.addElement(strB);
                        }
                    } else {
                        try {
                            Vector vector = this.O;
                            byte[] bArrD = dop.d(czbVarH.p().u());
                            int length = bArrD.length;
                            char[] cArr = new char[length];
                            for (int i3 = 0; i3 != length; i3++) {
                                cArr[i3] = (char) (bArrD[i3] & 255);
                            }
                            vector.addElement(b.g(new String(cArr), "#"));
                        } catch (IOException unused) {
                            throw new IllegalArgumentException("cannot encode value");
                        }
                    }
                    this.P.addElement(i2 != 0 ? L : M);
                    i2++;
                } else {
                    throw new IllegalArgumentException("badly sized pair");
                }
            }
        }
    }
}
