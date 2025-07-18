package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class ksx {
    private boolean A;
    private boolean B;
    private Boolean C;
    private long D;
    private List E;
    private String F;
    private boolean G;
    private long H;
    private long I;
    private int J;
    private boolean K;
    private Long L;
    private Long M;
    private String N;
    private String O;
    private byte[] P;
    private int Q;
    private long R;
    private long S;
    public final lbk a;
    public final String b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public String n;
    public boolean o;
    private String p;
    private String q;
    private String r;
    private String s;
    private long t;
    private long u;
    private String v;
    private long w;
    private String x;
    private long y;
    private long z;

    public ksx(lbk lbkVar, String str) {
        kkk.k(lbkVar);
        kkk.h(str);
        this.a = lbkVar;
        this.b = str;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
    }

    public final String A() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.O;
    }

    public final String B() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.F;
    }

    public final String C() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.N;
    }

    public final List D() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.E;
    }

    public final void E(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        long j2 = this.c + j;
        if (j2 > 2147483647L) {
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.f.b("Bundle index overflow. appId", lab.b(this.b));
            j2 = (-1) + j;
        }
        long j3 = this.g + 1;
        if (j3 > 2147483647L) {
            lab labVar2 = lbkVar.f;
            lbkVar.o(labVar2);
            labVar2.f.b("Delivery index overflow. appId", lab.b(this.b));
            j3 = 0;
        }
        this.o = true;
        this.c = j2;
        this.g = j3;
    }

    public final void F(byte[] bArr) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.P != bArr;
        this.P = bArr;
    }

    public final void G(int i) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.J != i;
        this.J = i;
    }

    public final void H(boolean z) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.B != z;
        this.B = z;
    }

    public final void I(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.p, str);
        this.p = str;
    }

    public final void J(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.x, str);
        this.x = str;
    }

    public final void K(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.v, str);
        this.v = str;
    }

    public final void L(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.w != j;
        this.w = j;
    }

    public final void M(int i) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.Q != i;
        this.Q = i;
    }

    public final void N(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.R != j;
        this.R = j;
    }

    public final void O(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.z != j;
        this.z = j;
    }

    public final void P(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.D != j;
        this.D = j;
    }

    public final void Q(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.S != j;
        this.S = j;
    }

    public final void R(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.s, str);
        this.s = str;
    }

    public final void S(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.o |= true ^ Objects.equals(this.q, str);
        this.q = str;
    }

    public final void T(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.y != j;
        this.y = j;
    }

    public final void U(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.n, str);
        this.n = str;
    }

    public final void V(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.u != j;
        this.u = j;
    }

    public final void W(long j) {
        kkk.a(j >= 0);
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.c != j;
        this.c = j;
    }

    public final void X(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.t != j;
        this.t = j;
    }

    public final void Y(boolean z) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.A != z;
        this.A = z;
    }

    public final void Z(Boolean bool) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.C, bool);
        this.C = bool;
    }

    public final int a() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.J;
    }

    public final void aa(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.r, str);
        this.r = str;
    }

    public final void ab(List list) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        if (Objects.equals(this.E, list)) {
            return;
        }
        this.o = true;
        this.E = list != null ? new ArrayList(list) : null;
    }

    public final void ac(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.O != str;
        this.O = str;
    }

    public final void ad(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.F, str);
        this.F = str;
    }

    public final void ae(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.I != j;
        this.I = j;
    }

    public final void af(String str) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.N != str;
        this.N = str;
    }

    public final void ag(boolean z) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.G != z;
        this.G = z;
    }

    public final void ah(long j) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.H != j;
        this.H = j;
    }

    public final void ai(boolean z) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= this.K != z;
        this.K = z;
    }

    public final void aj(Long l) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.L, l);
        this.L = l;
    }

    public final void ak(Long l) {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        this.o |= !Objects.equals(this.M, l);
        this.M = l;
    }

    public final boolean al() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.B;
    }

    public final boolean am() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.A;
    }

    public final boolean an() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.o;
    }

    public final boolean ao() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.G;
    }

    public final boolean ap() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.K;
    }

    public final byte[] aq() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.P;
    }

    public final int b() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.Q;
    }

    public final long c() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.w;
    }

    public final long d() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.d;
    }

    public final long e() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.R;
    }

    public final long f() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.z;
    }

    public final long g() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.D;
    }

    public final long h() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.S;
    }

    public final long i() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.y;
    }

    public final long j() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.g;
    }

    public final long k() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.u;
    }

    public final long l() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.c;
    }

    public final long m() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.t;
    }

    public final long n() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.I;
    }

    public final long o() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.H;
    }

    public final Boolean p() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.C;
    }

    public final Long q() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.L;
    }

    public final Long r() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.M;
    }

    public final String s() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        String str = this.n;
        U(null);
        return str;
    }

    public final String t() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.b;
    }

    public final String u() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.p;
    }

    public final String v() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.x;
    }

    public final String w() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.v;
    }

    public final String x() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.s;
    }

    public final String y() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.q;
    }

    public final String z() {
        lbk lbkVar = this.a;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.g();
        return this.r;
    }
}
