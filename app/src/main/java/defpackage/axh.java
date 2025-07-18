package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class axh extends avp {
    public int d;
    public CharSequence e;
    public CharSequence f;
    int g;
    int h;
    int i;
    int j;
    int k;

    protected axh() {
    }

    public void a(Bundle bundle, String str) {
        String string;
        if (!i() || (string = bundle.getString(str)) == null) {
            return;
        }
        this.b = string;
    }

    public void b(Bundle bundle, String str) {
        CharSequence charSequence;
        if (!i() || (charSequence = this.b) == null) {
            return;
        }
        bundle.putString(str, charSequence.toString());
    }

    public final boolean c() {
        return this.g == 1;
    }

    public final boolean d() {
        return (this.d & 8) == 8;
    }

    public final boolean e() {
        return (this.d & 1) == 1;
    }

    public final boolean f() {
        return this.g == 1;
    }

    public final boolean g() {
        return (this.d & 16) == 16;
    }

    public final boolean h() {
        return (this.d & 32) == 32;
    }

    final boolean i() {
        return f();
    }
}
