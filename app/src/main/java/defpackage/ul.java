package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ul {
    public static /* synthetic */ um a(int i, int i2) {
        return new um(i, i2, new agux() { // from class: uk
            @Override // defpackage.agux
            public final Object a(Object obj) {
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        });
    }
}
