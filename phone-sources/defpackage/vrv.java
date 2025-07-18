package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrv implements vrt {
    public final int a;

    public vrv(int i) {
        this.a = i;
    }

    @Override // defpackage.vrt
    public final String a(Context context) {
        String string = context.getString(this.a);
        string.getClass();
        return string;
    }
}
