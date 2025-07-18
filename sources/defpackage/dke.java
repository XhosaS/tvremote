package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dke {

    @Deprecated
    public static final dke A;

    @Deprecated
    public static final dke B;

    @Deprecated
    public static final dke C;

    @Deprecated
    public static final dke D;
    public static final dke E;
    public static final dke F;
    public static final dke G;
    public static final dke H;
    public static final dke I;
    public static final dke J;
    private static final Map L;
    public static final dke a;
    public static final dke b;
    public static final dke c;
    public static final dke d;
    public static final dke e;
    public static final dke f;
    public static final dke g;
    public static final dke h;
    public static final dke i;
    public static final dke j;
    public static final dke k;
    public static final dke l;
    public static final dke m;
    public static final dke n;
    public static final dke o;
    public static final dke p;
    public static final dke q;
    public static final dke r;
    public static final dke s;
    public static final dke t;
    public static final dke u;
    public static final dke v;
    public static final dke w;
    public static final dke x;

    @Deprecated
    public static final dke y;

    @Deprecated
    public static final dke z;
    public final String K;
    private final Integer M;
    private final dkb N;

    static {
        dke dkeVar = new dke(65793, "sha2-128f-robust", new dkd(16, 0));
        a = dkeVar;
        dke dkeVar2 = new dke(65794, "sha2-128s-robust", new dkd(16, 0));
        b = dkeVar2;
        dke dkeVar3 = new dke(65795, "sha2-192f-robust", new dkd(24, 0));
        c = dkeVar3;
        dke dkeVar4 = new dke(65796, "sha2-192s-robust", new dkd(24, 0));
        d = dkeVar4;
        dke dkeVar5 = new dke(65797, "sha2-256f-robust", new dkd(32, 0));
        e = dkeVar5;
        dke dkeVar6 = new dke(65798, "sha2-256s-robust", new dkd(32, 0));
        f = dkeVar6;
        dke dkeVar7 = new dke(66049, "sha2-128f", new dkd(16, 0));
        g = dkeVar7;
        dke dkeVar8 = new dke(66050, "sha2-128s", new dkd(16, 0));
        h = dkeVar8;
        dke dkeVar9 = new dke(66051, "sha2-192f", new dkd(24, 0));
        i = dkeVar9;
        dke dkeVar10 = new dke(66052, "sha2-192s", new dkd(24, 0));
        j = dkeVar10;
        dke dkeVar11 = new dke(66053, "sha2-256f", new dkd(32, 0));
        k = dkeVar11;
        dke dkeVar12 = new dke(66054, "sha2-256s", new dkd(32, 0));
        l = dkeVar12;
        dke dkeVar13 = new dke(131329, "shake-128f-robust", new dkd(16, 2));
        m = dkeVar13;
        dke dkeVar14 = new dke(131330, "shake-128s-robust", new dkd(16, 2));
        n = dkeVar14;
        dke dkeVar15 = new dke(131331, "shake-192f-robust", new dkd(24, 2));
        o = dkeVar15;
        dke dkeVar16 = new dke(131332, "shake-192s-robust", new dkd(24, 2));
        p = dkeVar16;
        dke dkeVar17 = new dke(131333, "shake-256f-robust", new dkd(32, 2));
        q = dkeVar17;
        dke dkeVar18 = new dke(131334, "shake-256s-robust", new dkd(32, 2));
        r = dkeVar18;
        dke dkeVar19 = new dke(131585, "shake-128f", new dkd(16, 2));
        s = dkeVar19;
        dke dkeVar20 = new dke(131586, "shake-128s", new dkd(16, 2));
        t = dkeVar20;
        dke dkeVar21 = new dke(131587, "shake-192f", new dkd(24, 2));
        u = dkeVar21;
        dke dkeVar22 = new dke(131588, "shake-192s", new dkd(24, 2));
        v = dkeVar22;
        dke dkeVar23 = new dke(131589, "shake-256f", new dkd(32, 2));
        w = dkeVar23;
        dke dkeVar24 = new dke(131590, "shake-256s", new dkd(32, 2));
        x = dkeVar24;
        dke dkeVar25 = new dke(196865, "haraka-128f-robust", new dkd(16, 1));
        y = dkeVar25;
        dke dkeVar26 = new dke(196866, "haraka-128s-robust", new dkd(16, 1));
        z = dkeVar26;
        dke dkeVar27 = new dke(196867, "haraka-192f-robust", new dkd(24, 1));
        A = dkeVar27;
        dke dkeVar28 = new dke(196868, "haraka-192s-robust", new dkd(24, 1));
        B = dkeVar28;
        dke dkeVar29 = new dke(196869, "haraka-256f-robust", new dkd(32, 1));
        C = dkeVar29;
        dke dkeVar30 = new dke(196870, "haraka-256s-robust", new dkd(32, 1));
        D = dkeVar30;
        dke dkeVar31 = new dke(197121, "haraka-128f-simple", new dkd(16, 1));
        E = dkeVar31;
        dke dkeVar32 = new dke(197122, "haraka-128s-simple", new dkd(16, 1));
        F = dkeVar32;
        dke dkeVar33 = new dke(197123, "haraka-192f-simple", new dkd(24, 1));
        G = dkeVar33;
        dke dkeVar34 = new dke(197124, "haraka-192s-simple", new dkd(24, 1));
        H = dkeVar34;
        dke dkeVar35 = new dke(197125, "haraka-256f-simple", new dkd(32, 1));
        I = dkeVar35;
        dke dkeVar36 = new dke(197126, "haraka-256s-simple", new dkd(32, 1));
        J = dkeVar36;
        L = new HashMap();
        dke[] dkeVarArr = {dkeVar, dkeVar2, dkeVar3, dkeVar4, dkeVar5, dkeVar6, dkeVar7, dkeVar8, dkeVar9, dkeVar10, dkeVar11, dkeVar12, dkeVar13, dkeVar14, dkeVar15, dkeVar16, dkeVar17, dkeVar18, dkeVar19, dkeVar20, dkeVar21, dkeVar22, dkeVar23, dkeVar24, dkeVar25, dkeVar26, dkeVar27, dkeVar28, dkeVar29, dkeVar30, dkeVar31, dkeVar32, dkeVar33, dkeVar34, dkeVar35, dkeVar36};
        for (int i2 = 0; i2 < 36; i2++) {
            dke dkeVar37 = dkeVarArr[i2];
            L.put(dkeVar37.M, dkeVar37);
        }
    }

    private dke(Integer num, String str, dkb dkbVar) {
        this.M = num;
        this.K = str;
        this.N = dkbVar;
    }

    final int a() {
        return this.N.a();
    }
}
