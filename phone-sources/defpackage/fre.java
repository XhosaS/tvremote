package defpackage;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fre {
    public final AudioAttributes.Builder a = new AudioAttributes.Builder();

    public frf a() {
        return new frf(this.a.build());
    }

    @Override // 
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(int i) {
        if (i == 16) {
            i = 12;
        }
        this.a.setUsage(i);
    }
}
