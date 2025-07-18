package defpackage;

import android.support.v7.appcompat.R;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zng extends zix {
    public static final zjb A;
    public static final zjb B;
    public static final zjb C;
    public static final zjb D;
    public static final zjb E;
    public static final zjb F;
    public static final zjb G;
    public static final Hashtable H;
    public static final Hashtable I;
    public static final Hashtable J;
    public static final Hashtable K;
    private static final Boolean L;
    private static final Boolean M;
    public static final zjb a;
    public static final zjb b;
    public static final zjb c;
    public static final zjb d;
    public static final zjb e;
    public static final zjb f;
    public static final zjb g;
    public static final zjb h;
    public static final zjb i;
    public static final zjb j;
    public static final zjb k;
    public static final zjb l;
    public static final zjb m;
    public static final zjb n;
    public static final zjb o;
    public static final zjb p;
    public static final zjb q;
    public static final zjb r;
    public static final zjb s;
    public static final zjb t;
    public static final zjb u;
    public static final zjb v;
    public static final zjb w;
    public static final zjb x;
    public static final zjb y;
    public static final zjb z;
    private Vector N = new Vector();
    private Vector O = new Vector();
    private Vector P = new Vector();
    private zjm Q;
    private boolean R;
    private int S;

    static {
        zjb zjbVar = new zjb("2.5.4.6");
        a = zjbVar;
        zjb zjbVar2 = new zjb("2.5.4.10");
        b = zjbVar2;
        zjb zjbVar3 = new zjb("2.5.4.11");
        c = zjbVar3;
        zjb zjbVar4 = new zjb("2.5.4.12");
        d = zjbVar4;
        zjb zjbVar5 = new zjb("2.5.4.3");
        e = zjbVar5;
        zjb zjbVar6 = new zjb("2.5.4.5");
        f = zjbVar6;
        zjb zjbVar7 = new zjb("2.5.4.9");
        g = zjbVar7;
        zjb zjbVar8 = new zjb("2.5.4.7");
        h = zjbVar8;
        zjb zjbVar9 = new zjb("2.5.4.8");
        i = zjbVar9;
        zjb zjbVar10 = new zjb("2.5.4.4");
        j = zjbVar10;
        zjb zjbVar11 = new zjb("2.5.4.42");
        k = zjbVar11;
        zjb zjbVar12 = new zjb("2.5.4.43");
        l = zjbVar12;
        zjb zjbVar13 = new zjb("2.5.4.44");
        m = zjbVar13;
        zjb zjbVar14 = new zjb("2.5.4.45");
        n = zjbVar14;
        zjb zjbVar15 = new zjb("2.5.4.15");
        o = zjbVar15;
        zjb zjbVar16 = new zjb("2.5.4.17");
        p = zjbVar16;
        zjb zjbVar17 = new zjb("2.5.4.46");
        q = zjbVar17;
        zjb zjbVar18 = new zjb("2.5.4.65");
        r = zjbVar18;
        zjb zjbVar19 = new zjb("1.3.6.1.5.5.7.9.1");
        s = zjbVar19;
        zjb zjbVar20 = new zjb("1.3.6.1.5.5.7.9.2");
        t = zjbVar20;
        zjb zjbVar21 = new zjb("1.3.6.1.5.5.7.9.3");
        u = zjbVar21;
        zjb zjbVar22 = new zjb("1.3.6.1.5.5.7.9.4");
        v = zjbVar22;
        zjb zjbVar23 = new zjb("1.3.6.1.5.5.7.9.5");
        w = zjbVar23;
        zjb zjbVar24 = new zjb("1.3.36.8.3.14");
        x = zjbVar24;
        zjb zjbVar25 = new zjb("2.5.4.16");
        y = zjbVar25;
        new zjb("2.5.4.54");
        zjb zjbVar26 = znh.a;
        z = zjbVar26;
        zjb zjbVar27 = znh.b;
        A = zjbVar27;
        zjb zjbVar28 = zlp.u;
        B = zjbVar28;
        zjb zjbVar29 = zlp.v;
        C = zjbVar29;
        zjb zjbVar30 = zlp.w;
        D = zjbVar30;
        E = zjbVar28;
        zjb zjbVar31 = new zjb("0.9.2342.19200300.100.1.25");
        F = zjbVar31;
        zjb zjbVar32 = new zjb("0.9.2342.19200300.100.1.1");
        G = zjbVar32;
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
        hashtable.put(zjbVar, "C");
        hashtable.put(zjbVar2, "O");
        hashtable.put(zjbVar4, "T");
        hashtable.put(zjbVar3, "OU");
        hashtable.put(zjbVar5, "CN");
        hashtable.put(zjbVar8, "L");
        hashtable.put(zjbVar9, "ST");
        hashtable.put(zjbVar6, "SERIALNUMBER");
        hashtable.put(zjbVar28, "E");
        hashtable.put(zjbVar31, "DC");
        hashtable.put(zjbVar32, "UID");
        hashtable.put(zjbVar7, "STREET");
        hashtable.put(zjbVar10, "SURNAME");
        hashtable.put(zjbVar11, "GIVENNAME");
        hashtable.put(zjbVar12, "INITIALS");
        hashtable.put(zjbVar13, "GENERATION");
        hashtable.put(zjbVar30, "unstructuredAddress");
        hashtable.put(zjbVar29, "unstructuredName");
        hashtable.put(zjbVar14, "UniqueIdentifier");
        hashtable.put(zjbVar17, "DN");
        hashtable.put(zjbVar18, "Pseudonym");
        hashtable.put(zjbVar25, "PostalAddress");
        hashtable.put(zjbVar24, "NameAtBirth");
        hashtable.put(zjbVar22, "CountryOfCitizenship");
        hashtable.put(zjbVar23, "CountryOfResidence");
        hashtable.put(zjbVar21, "Gender");
        hashtable.put(zjbVar20, "PlaceOfBirth");
        hashtable.put(zjbVar19, "DateOfBirth");
        hashtable.put(zjbVar16, "PostalCode");
        hashtable.put(zjbVar15, "BusinessCategory");
        hashtable.put(zjbVar26, "TelephoneNumber");
        hashtable.put(zjbVar27, "Name");
        hashtable2.put(zjbVar, "C");
        hashtable2.put(zjbVar2, "O");
        hashtable2.put(zjbVar3, "OU");
        hashtable2.put(zjbVar5, "CN");
        hashtable2.put(zjbVar8, "L");
        hashtable2.put(zjbVar9, "ST");
        hashtable2.put(zjbVar7, "STREET");
        hashtable2.put(zjbVar31, "DC");
        hashtable2.put(zjbVar32, "UID");
        hashtable3.put(zjbVar, "C");
        hashtable3.put(zjbVar2, "O");
        hashtable3.put(zjbVar3, "OU");
        hashtable3.put(zjbVar5, "CN");
        hashtable3.put(zjbVar8, "L");
        hashtable3.put(zjbVar9, "ST");
        hashtable3.put(zjbVar7, "STREET");
        hashtable4.put("c", zjbVar);
        hashtable4.put("o", zjbVar2);
        hashtable4.put("t", zjbVar4);
        hashtable4.put("ou", zjbVar3);
        hashtable4.put("cn", zjbVar5);
        hashtable4.put("l", zjbVar8);
        hashtable4.put("st", zjbVar9);
        hashtable4.put("sn", zjbVar6);
        hashtable4.put("serialnumber", zjbVar6);
        hashtable4.put("street", zjbVar7);
        hashtable4.put("emailaddress", zjbVar28);
        hashtable4.put("dc", zjbVar31);
        hashtable4.put("e", zjbVar28);
        hashtable4.put("uid", zjbVar32);
        hashtable4.put("surname", zjbVar10);
        hashtable4.put("givenname", zjbVar11);
        hashtable4.put("initials", zjbVar12);
        hashtable4.put("generation", zjbVar13);
        hashtable4.put("unstructuredaddress", zjbVar30);
        hashtable4.put("unstructuredname", zjbVar29);
        hashtable4.put("uniqueidentifier", zjbVar14);
        hashtable4.put("dn", zjbVar17);
        hashtable4.put("pseudonym", zjbVar18);
        hashtable4.put("postaladdress", zjbVar25);
        hashtable4.put("nameofbirth", zjbVar24);
        hashtable4.put("countryofcitizenship", zjbVar22);
        hashtable4.put("countryofresidence", zjbVar23);
        hashtable4.put("gender", zjbVar21);
        hashtable4.put("placeofbirth", zjbVar20);
        hashtable4.put("dateofbirth", zjbVar19);
        hashtable4.put("postalcode", zjbVar16);
        hashtable4.put("businesscategory", zjbVar15);
        hashtable4.put("telephonenumber", zjbVar26);
        hashtable4.put("name", zjbVar27);
    }

    protected zng() {
    }

    private static final void a(StringBuffer stringBuffer, Hashtable hashtable, zjb zjbVar, String str) {
        String str2 = (String) hashtable.get(zjbVar);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(zjbVar.b());
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
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
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
        String strB = zxr.b(str.trim());
        if (strB.length() > 0 && strB.charAt(0) == '#') {
            try {
                zxn zxnVarV = zjh.v(zxx.f(strB, strB.length() - 1));
                if (zxnVarV instanceof zjp) {
                    return zxr.b(((zjp) zxnVarV).b().trim());
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
    @Override // defpackage.zix
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
            boolean r1 = r14 instanceof defpackage.zng
            r2 = 0
            if (r1 != 0) goto Lf
            boolean r3 = r14 instanceof defpackage.zjm
            if (r3 == 0) goto Le
            goto Lf
        Le:
            return r2
        Lf:
            r3 = r14
            zih r3 = (defpackage.zih) r3
            zjh r3 = r3.p()
            zjh r4 = r13.p()
            boolean r3 = r4.w(r3)
            if (r3 != 0) goto Lc6
            if (r1 == 0) goto L25
            zng r14 = (defpackage.zng) r14     // Catch: java.lang.IllegalArgumentException -> Lc5
            goto L45
        L25:
            boolean r1 = r14 instanceof defpackage.zlw     // Catch: java.lang.IllegalArgumentException -> Lc5
            if (r1 == 0) goto L37
            zng r1 = new zng     // Catch: java.lang.IllegalArgumentException -> Lc5
            zlw r14 = (defpackage.zlw) r14     // Catch: java.lang.IllegalArgumentException -> Lc5
            zkq r14 = r14.a     // Catch: java.lang.IllegalArgumentException -> Lc5
            zjm r14 = defpackage.zjm.j(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            r1.<init>(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
            goto L42
        L37:
            if (r14 == 0) goto L44
            zng r1 = new zng     // Catch: java.lang.IllegalArgumentException -> Lc5
            zjm r14 = defpackage.zjm.j(r14)     // Catch: java.lang.IllegalArgumentException -> Lc5
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
            zjb r7 = (defpackage.zjb) r7
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
            zjb r10 = (defpackage.zjb) r10
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zng.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.zix
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

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        if (this.Q == null) {
            zii ziiVar = new zii();
            zii ziiVar2 = new zii();
            if (this.N.size() != 0) {
                new zii(2).b((zjb) this.N.elementAt(0));
                throw null;
            }
            ziiVar.b(new zkr(ziiVar2));
            this.Q = new zkq(ziiVar);
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
                a(stringBuffer2, hashtable, (zjb) this.N.elementAt(i2), (String) this.O.elementAt(i2));
            } else {
                stringBuffer2 = new StringBuffer();
                a(stringBuffer2, hashtable, (zjb) this.N.elementAt(i2), (String) this.O.elementAt(i2));
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

    public zng(zjm zjmVar) {
        this.Q = zjmVar;
        Enumeration enumerationF = zjmVar.f();
        while (enumerationF.hasMoreElements()) {
            zjo zjoVarG = zjo.g(((zih) enumerationF.nextElement()).p());
            int i2 = 0;
            while (i2 < zjoVarG.b()) {
                zjm zjmVarJ = zjm.j(zjoVarG.f(i2).p());
                if (zjmVarJ.b() == 2) {
                    this.N.addElement(zjb.h(zjmVarJ.h(0)));
                    zih zihVarH = zjmVarJ.h(1);
                    if ((zihVarH instanceof zjp) && !(zihVarH instanceof zjv)) {
                        String strB = ((zjp) zihVarH).b();
                        if (strB.length() > 0 && strB.charAt(0) == '#') {
                            this.O.addElement("\\".concat(strB));
                        } else {
                            this.O.addElement(strB);
                        }
                    } else {
                        try {
                            Vector vector = this.O;
                            byte[] bArrD = zxx.d(zihVarH.p().u());
                            int length = bArrD.length;
                            char[] cArr = new char[length];
                            for (int i3 = 0; i3 != length; i3++) {
                                cArr[i3] = (char) (bArrD[i3] & 255);
                            }
                            vector.addElement(a.cr(new String(cArr), "#"));
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
