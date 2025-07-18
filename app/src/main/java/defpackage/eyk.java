package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyk {
    public final void a(Intent intent, Intent intent2, String str) {
        if (intent2.hasExtra(str)) {
            intent.putExtra(str, intent2.getBooleanExtra(str, false));
        }
    }

    public final void b(Intent intent, Intent intent2, String str) {
        if (intent2.hasExtra(str)) {
            intent.putExtra(str, intent2.getIntExtra(str, -1));
        }
    }

    public final void c(Intent intent, Intent intent2, String str) {
        if (intent2.hasExtra(str)) {
            intent.putExtra(str, intent2.getStringExtra(str));
        }
    }
}
