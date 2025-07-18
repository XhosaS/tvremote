package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ztn {

    @Deprecated
    public static final ztn A;

    @Deprecated
    public static final ztn B;

    @Deprecated
    public static final ztn C;

    @Deprecated
    public static final ztn D;
    public static final ztn E;
    public static final ztn F;
    public static final ztn G;
    public static final ztn H;
    public static final ztn I;
    public static final ztn J;
    private static final Map L;
    public static final ztn a;
    public static final ztn b;
    public static final ztn c;
    public static final ztn d;
    public static final ztn e;
    public static final ztn f;
    public static final ztn g;
    public static final ztn h;
    public static final ztn i;
    public static final ztn j;
    public static final ztn k;
    public static final ztn l;
    public static final ztn m;
    public static final ztn n;
    public static final ztn o;
    public static final ztn p;
    public static final ztn q;
    public static final ztn r;
    public static final ztn s;
    public static final ztn t;
    public static final ztn u;
    public static final ztn v;
    public static final ztn w;
    public static final ztn x;

    @Deprecated
    public static final ztn y;

    @Deprecated
    public static final ztn z;
    public final String K;
    private final Integer M;
    private final ztk N;

    static {
        ztn ztnVar = new ztn(65793, "sha2-128f-robust", new ztm(16, 0));
        a = ztnVar;
        ztn ztnVar2 = new ztn(65794, "sha2-128s-robust", new ztm(16, 0));
        b = ztnVar2;
        ztn ztnVar3 = new ztn(65795, "sha2-192f-robust", new ztm(24, 0));
        c = ztnVar3;
        ztn ztnVar4 = new ztn(65796, "sha2-192s-robust", new ztm(24, 0));
        d = ztnVar4;
        ztn ztnVar5 = new ztn(65797, "sha2-256f-robust", new ztm(32, 0));
        e = ztnVar5;
        ztn ztnVar6 = new ztn(65798, "sha2-256s-robust", new ztm(32, 0));
        f = ztnVar6;
        ztn ztnVar7 = new ztn(66049, "sha2-128f", new ztm(16, 0));
        g = ztnVar7;
        ztn ztnVar8 = new ztn(66050, "sha2-128s", new ztm(16, 0));
        h = ztnVar8;
        ztn ztnVar9 = new ztn(66051, "sha2-192f", new ztm(24, 0));
        i = ztnVar9;
        ztn ztnVar10 = new ztn(66052, "sha2-192s", new ztm(24, 0));
        j = ztnVar10;
        ztn ztnVar11 = new ztn(66053, "sha2-256f", new ztm(32, 0));
        k = ztnVar11;
        ztn ztnVar12 = new ztn(66054, "sha2-256s", new ztm(32, 0));
        l = ztnVar12;
        ztn ztnVar13 = new ztn(131329, "shake-128f-robust", new ztm(16, 2));
        m = ztnVar13;
        ztn ztnVar14 = new ztn(131330, "shake-128s-robust", new ztm(16, 2));
        n = ztnVar14;
        ztn ztnVar15 = new ztn(131331, "shake-192f-robust", new ztm(24, 2));
        o = ztnVar15;
        ztn ztnVar16 = new ztn(131332, "shake-192s-robust", new ztm(24, 2));
        p = ztnVar16;
        ztn ztnVar17 = new ztn(131333, "shake-256f-robust", new ztm(32, 2));
        q = ztnVar17;
        ztn ztnVar18 = new ztn(131334, "shake-256s-robust", new ztm(32, 2));
        r = ztnVar18;
        ztn ztnVar19 = new ztn(131585, "shake-128f", new ztm(16, 2));
        s = ztnVar19;
        ztn ztnVar20 = new ztn(131586, "shake-128s", new ztm(16, 2));
        t = ztnVar20;
        ztn ztnVar21 = new ztn(131587, "shake-192f", new ztm(24, 2));
        u = ztnVar21;
        ztn ztnVar22 = new ztn(131588, "shake-192s", new ztm(24, 2));
        v = ztnVar22;
        ztn ztnVar23 = new ztn(131589, "shake-256f", new ztm(32, 2));
        w = ztnVar23;
        ztn ztnVar24 = new ztn(131590, "shake-256s", new ztm(32, 2));
        x = ztnVar24;
        ztn ztnVar25 = new ztn(196865, "haraka-128f-robust", new ztm(16, 1));
        y = ztnVar25;
        ztn ztnVar26 = new ztn(196866, "haraka-128s-robust", new ztm(16, 1));
        z = ztnVar26;
        ztn ztnVar27 = new ztn(196867, "haraka-192f-robust", new ztm(24, 1));
        A = ztnVar27;
        ztn ztnVar28 = new ztn(196868, "haraka-192s-robust", new ztm(24, 1));
        B = ztnVar28;
        ztn ztnVar29 = new ztn(196869, "haraka-256f-robust", new ztm(32, 1));
        C = ztnVar29;
        ztn ztnVar30 = new ztn(196870, "haraka-256s-robust", new ztm(32, 1));
        D = ztnVar30;
        ztn ztnVar31 = new ztn(197121, "haraka-128f-simple", new ztm(16, 1));
        E = ztnVar31;
        ztn ztnVar32 = new ztn(197122, "haraka-128s-simple", new ztm(16, 1));
        F = ztnVar32;
        ztn ztnVar33 = new ztn(197123, "haraka-192f-simple", new ztm(24, 1));
        G = ztnVar33;
        ztn ztnVar34 = new ztn(197124, "haraka-192s-simple", new ztm(24, 1));
        H = ztnVar34;
        ztn ztnVar35 = new ztn(197125, "haraka-256f-simple", new ztm(32, 1));
        I = ztnVar35;
        ztn ztnVar36 = new ztn(197126, "haraka-256s-simple", new ztm(32, 1));
        J = ztnVar36;
        L = new HashMap();
        ztn[] ztnVarArr = {ztnVar, ztnVar2, ztnVar3, ztnVar4, ztnVar5, ztnVar6, ztnVar7, ztnVar8, ztnVar9, ztnVar10, ztnVar11, ztnVar12, ztnVar13, ztnVar14, ztnVar15, ztnVar16, ztnVar17, ztnVar18, ztnVar19, ztnVar20, ztnVar21, ztnVar22, ztnVar23, ztnVar24, ztnVar25, ztnVar26, ztnVar27, ztnVar28, ztnVar29, ztnVar30, ztnVar31, ztnVar32, ztnVar33, ztnVar34, ztnVar35, ztnVar36};
        for (int i2 = 0; i2 < 36; i2++) {
            ztn ztnVar37 = ztnVarArr[i2];
            L.put(ztnVar37.M, ztnVar37);
        }
    }

    private ztn(Integer num, String str, ztk ztkVar) {
        this.M = num;
        this.K = str;
        this.N = ztkVar;
    }

    final int a() {
        return this.N.a();
    }
}
