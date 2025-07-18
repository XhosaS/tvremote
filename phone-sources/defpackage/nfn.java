package defpackage;

import com.google.common.collect.ImmutableList;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nfn extends nez {
    private final int a;
    private final String c;
    private final nfc d;
    private String e;
    private String f;
    private int g;
    private int h;
    private String i;
    private String j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;

    public nfn(int i, nfc nfcVar) {
        i = i != 1 ? 2 : i;
        a.H(true);
        this.a = i;
        this.c = i == 1 ? "afs" : "vfs";
        this.d = nfcVar;
        this.e = "0";
        this.f = "0";
        this.g = 0;
        this.h = 0;
        this.n = 1;
    }

    private static String A(String str) {
        return str == null ? "0" : str;
    }

    private final void B(dze dzeVar) {
        if (dzeVar.ac == null || this.l) {
            return;
        }
        this.l = true;
        this.b.g("drm");
        this.b.f("drm", "1");
    }

    private final void C(ekl eklVar) {
        if ("0".equals(this.e) != "0".equals(this.f)) {
            return;
        }
        if (this.i == null && "0".equals(this.e) && !this.m) {
            return;
        }
        boolean zEquals = Objects.equals(this.e, this.i);
        boolean z = (Objects.equals(this.f, this.j) || "0".equals(this.i) || this.a != 2) ? false : true;
        int i = this.g;
        boolean z2 = (i == this.h || i == 0) ? false : true;
        if (!zEquals || z || z2) {
            if (this.i == null) {
                this.g = 1;
            }
            StringBuilder sbE = this.b.e(eklVar.a);
            sbE.append(this.e);
            sbE.append(':');
            int i2 = this.a;
            if (i2 == 2) {
                String str = this.f;
                if (str != null) {
                    sbE.append(str);
                }
                sbE.append(':');
            }
            String str2 = this.i;
            if (str2 != null) {
                sbE.append(str2);
            }
            sbE.append(':');
            int i3 = this.g;
            sbE.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "" : "p" : "a" : "m" : "i");
            this.b.f(this.c, sbE.toString());
            if (i2 == 2) {
                this.b.g("fmt");
                this.b.f("fmt", this.e);
            }
            this.i = this.e;
            this.j = this.f;
            this.h = this.g;
            this.g = 0;
        }
    }

    @Override // defpackage.nez
    public final void a(ekl eklVar) {
        this.k = true;
        if (this.n != 3 || this.m) {
            return;
        }
        this.m = true;
        C(eklVar);
    }

    @Override // defpackage.nez
    public final void b() {
        this.b.g(this.c);
    }

    @Override // defpackage.nez
    public final void f(ekl eklVar, evv evvVar, boolean z) {
        if (evvVar.b == this.a && z) {
            nfc nfcVar = this.d;
            dze dzeVar = evvVar.c;
            dzeVar.getClass();
            this.e = A(nfcVar.b(dzeVar));
            this.g = evvVar.d;
            C(eklVar);
        }
    }

    @Override // defpackage.nez
    public final void m(ekl eklVar, boolean z, int i, boolean z2) {
        this.n = i;
        if (i == 3 && this.k && !this.m) {
            this.m = true;
            C(eklVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nez
    public final void p(ekl eklVar, ebh ebhVar, boolean z) {
        int i;
        if (z) {
            ImmutableList immutableList = ebhVar.c;
            dze dzeVar = null;
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                ebg ebgVar = (ebg) immutableList.get(i2);
                if (this.a == ebgVar.a()) {
                    for (int i3 = 0; i3 < ebgVar.e; i3++) {
                        if (ebgVar.c(i3)) {
                            dze dzeVarB = ebgVar.b(i3);
                            B(dzeVarB);
                            if (dzeVar == null || (i = dzeVar.T) == -1 || i < dzeVarB.T) {
                                dzeVar = dzeVarB;
                            }
                        }
                    }
                }
            }
            if (dzeVar == null) {
                this.f = "0";
                this.e = "0";
            } else {
                this.f = A(this.d.b(dzeVar));
            }
            C(eklVar);
        }
    }

    @Override // defpackage.nez
    public final void q(dze dzeVar, boolean z) {
        if (this.a == 1 && z) {
            B(dzeVar);
        }
    }

    @Override // defpackage.nez
    public final void z(dze dzeVar, boolean z) {
        if (this.a == 2 && z) {
            B(dzeVar);
        }
    }
}
