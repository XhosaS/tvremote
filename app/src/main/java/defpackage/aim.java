package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aim extends aiq {
    final WindowInsets.Builder a;

    public aim() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.aiq
    public ajc a() {
        h();
        ajc ajcVarG = ajc.g(this.a.build(), null);
        ajcVarG.b.g(this.b);
        return ajcVarG;
    }

    @Override // defpackage.aiq
    public void b(acs acsVar) {
        this.a.setStableInsets(acsVar.a());
    }

    @Override // defpackage.aiq
    public void c(acs acsVar) {
        this.a.setSystemWindowInsets(acsVar.a());
    }

    @Override // defpackage.aiq
    public void d(acs acsVar) {
        this.a.setMandatorySystemGestureInsets(acsVar.a());
    }

    @Override // defpackage.aiq
    public void e(acs acsVar) {
        this.a.setSystemGestureInsets(acsVar.a());
    }

    @Override // defpackage.aiq
    public void f(acs acsVar) {
        this.a.setTappableElementInsets(acsVar.a());
    }

    public aim(ajc ajcVar) {
        WindowInsets.Builder builder;
        super(ajcVar);
        WindowInsets windowInsetsE = ajcVar.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
