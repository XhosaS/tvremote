package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aiq {
    private final ajc a;
    acs[] b;

    public aiq(ajc ajcVar) {
        this.a = ajcVar;
    }

    public ajc a() {
        h();
        return this.a;
    }

    public void g(int i, acs acsVar) {
        if (this.b == null) {
            this.b = new acs[10];
        }
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                this.b[aiz.a(i2)] = acsVar;
            }
        }
    }

    protected final void h() {
        acs[] acsVarArr = this.b;
        if (acsVarArr != null) {
            acs acsVarA = acsVarArr[aiz.a(1)];
            acs acsVarA2 = this.b[aiz.a(2)];
            if (acsVarA2 == null) {
                acsVarA2 = this.a.b.a(2);
            }
            if (acsVarA == null) {
                acsVarA = this.a.b.a(1);
            }
            c(acs.b(acsVarA, acsVarA2));
            acs acsVar = this.b[aiz.a(16)];
            if (acsVar != null) {
                e(acsVar);
            }
            acs acsVar2 = this.b[aiz.a(32)];
            if (acsVar2 != null) {
                d(acsVar2);
            }
            acs acsVar3 = this.b[aiz.a(64)];
            if (acsVar3 != null) {
                f(acsVar3);
            }
        }
    }

    public aiq() {
        this(new ajc());
    }

    public void b(acs acsVar) {
    }

    public void c(acs acsVar) {
    }

    public void d(acs acsVar) {
    }

    public void e(acs acsVar) {
    }

    public void f(acs acsVar) {
    }
}
