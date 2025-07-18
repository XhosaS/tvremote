package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
class aun {
    final Resources a;
    final String b;

    public aun(Resources resources, String str) {
        this.a = resources;
        this.b = str;
    }

    public final boolean a(String str, boolean z) {
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "bool", this.b);
        return identifier > 0 ? resources.getBoolean(identifier) : z;
    }
}
