package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgw extends mgy {
    public final Context a;
    public final yqt b;
    private final yqt c;
    private final yqt d;

    public mgw(Context context, yqt yqtVar, yqt yqtVar2, yqt yqtVar3) {
        this.a = context;
        this.c = yqtVar;
        this.d = yqtVar2;
        this.b = yqtVar3;
    }

    @Override // defpackage.mgy
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.mgy
    public final yqt b() {
        return this.c;
    }

    @Override // defpackage.mgy
    public final yqt c() {
        return this.b;
    }

    @Override // defpackage.mgy
    public final yqt d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgy) {
            mgy mgyVar = (mgy) obj;
            if (this.a.equals(mgyVar.a()) && this.c.equals(mgyVar.b()) && this.d.equals(mgyVar.d())) {
                mgyVar.e();
                if (this.b.equals(mgyVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CollectionBasisContext{context=" + this.a.toString() + ", accountNames=Optional.absent(), stacktrace=" + this.d.toString() + ", googlerOverridesCheckbox=false, executor=Optional.absent()}";
    }

    @Override // defpackage.mgy
    public final void e() {
    }
}
