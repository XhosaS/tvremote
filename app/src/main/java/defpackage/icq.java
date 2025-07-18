package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icq {
    public final Bundle a = new Bundle();

    public final void a(icg icgVar, boolean z) {
        icgVar.getClass();
        icg.a.b(icgVar, 1);
        this.a.putBoolean(icgVar.w, z);
    }

    public final void b(icg icgVar, String str) {
        icgVar.getClass();
        str.getClass();
        icg.a.b(icgVar, 3);
        this.a.putString(icgVar.w, str);
    }

    public final void c(icg icgVar, Collection collection) {
        icgVar.getClass();
        icg.a.b(icgVar, 4);
        this.a.putStringArrayList(icgVar.w, new ArrayList<>(collection));
    }
}
