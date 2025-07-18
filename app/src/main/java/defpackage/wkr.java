package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wkr {
    public static final zdy a = zdy.h("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxChecker");
    private final lwj c;
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicBoolean d = new AtomicBoolean(false);

    public wkr(lwj lwjVar) {
        this.c = lwjVar;
    }

    public final zyd a() {
        if (!this.d.getAndSet(true)) {
            this.c.b(new lwi() { // from class: wko
                @Override // defpackage.lwi
                public final void a() {
                    this.a.b.set(null);
                }
            });
        }
        Boolean bool = (Boolean) this.b.get();
        if (bool != null) {
            return zxn.h(bool);
        }
        zwx zwxVarU = zwx.u(otn.a(this.c.a()));
        yqi yqiVarA = wyo.a(new yqi() { // from class: wkp
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                boolean z = ((lwc) obj).a() == 1;
                AtomicReference atomicReference = this.a.b;
                Boolean boolValueOf = Boolean.valueOf(z);
                atomicReference.set(boolValueOf);
                return boolValueOf;
            }
        });
        zwk zwkVar = zwk.a;
        return zud.g(zuz.g(zwxVarU, yqiVarA, zwkVar), Throwable.class, new yqi() { // from class: wkq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                ((zdv) ((zdv) ((zdv) wkr.a.d()).p((Throwable) obj)).q("com/google/apps/tiktok/monitoring/checkbox/TikTokCheckboxChecker", "shouldLog", 77, "TikTokCheckboxChecker.java")).u("fetching usage reporting opt-in failed");
                this.a.b.set(false);
                return false;
            }
        }, zwkVar);
    }
}
