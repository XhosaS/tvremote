package defpackage;

import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class biu implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public biu(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
