package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class coz extends Application implements cpd {
    public volatile cpc d;

    private final void b() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    a().b(this);
                    if (this.d == null) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }

    protected abstract cox a();

    @Override // defpackage.cpd
    public final cox e() {
        b();
        return this.d;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        b();
    }
}
