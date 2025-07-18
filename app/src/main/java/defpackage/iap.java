package defpackage;

import android.app.Service;
import com.google.android.apps.tvsearch.settings.SearchSettingsService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iap extends Service implements aeja {
    private volatile aeis a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.aeja
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aeis cO() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new aeis(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.aeiz
    public final Object dN() {
        return cO().dN();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ((SearchSettingsService) this).a = ((etn) cO().dN()).a();
        }
        super.onCreate();
    }
}
