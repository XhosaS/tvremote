package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class qyj {
    static qyj c(Activity activity) {
        return new qxv(new qpi(activity.getClass().getName()));
    }

    public abstract qpi a();

    public abstract void b();

    public final boolean equals(Object obj) {
        if (!(obj instanceof qyj)) {
            return false;
        }
        qyj qyjVar = (qyj) obj;
        if (!a().a.equals(qyjVar.a().a)) {
            return false;
        }
        qyjVar.b();
        return true;
    }

    public final int hashCode() {
        return (a().a.hashCode() * 31) ^ 1231;
    }
}
