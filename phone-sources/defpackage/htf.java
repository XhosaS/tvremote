package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htf implements hln {
    private final /* synthetic */ int a;

    public htf(int i) {
        this.a = i;
    }

    @Override // defpackage.hln
    public final /* synthetic */ hnv a(Object obj, int i, int i2, hll hllVar) {
        int i3 = this.a;
        return i3 != 0 ? i3 != 1 ? new hqz((File) obj) : new hsz((Bitmap) obj, 1) : htd.g((Drawable) obj);
    }

    @Override // defpackage.hln
    public final /* synthetic */ boolean b(Object obj, hll hllVar) {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return true;
        }
        return true;
    }
}
