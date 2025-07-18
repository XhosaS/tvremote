package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wiy implements aeiz, aeib {
    private final Context a;
    private final wit b;
    private final aeiz c;
    private volatile Object d;
    private final Object e = new Object();

    public wiy(Context context, wit witVar) {
        this.a = context;
        this.b = witVar;
        this.c = new aeig(context, witVar);
    }

    @Override // defpackage.aeib
    public final aehj a() {
        return ((aeig) this.c).dN();
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    Context applicationContext = this.a.getApplicationContext();
                    yqw.R(applicationContext instanceof aeiz, "TikTokFragmentHost must be created with a @Sting Application: Found: %s", applicationContext);
                    esz eszVarB = ((wix) aehg.a(this.c, wix.class)).b();
                    eszVarB.b = this.b;
                    this.d = eszVarB.a();
                }
            }
        }
        return this.d;
    }
}
