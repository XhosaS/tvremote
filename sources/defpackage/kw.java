package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kw implements ctu {
    private final /* synthetic */ int a;

    @Override // defpackage.ctu
    public final Object a(Object obj) {
        int i = this.a;
        if (i == 0) {
            return Boolean.valueOf((((Resources) obj).getConfiguration().uiMode & 48) == 32);
        }
        if (i == 1) {
            ((Boolean) obj).booleanValue();
            return cse.a;
        }
        if (i == 2) {
            return obj;
        }
        if (obj instanceof cvm) {
            return (cvm) obj;
        }
        return null;
    }
}
