package defpackage;

import android.R;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcq {
    public final int c;
    public final short[] a = new short[256];
    public final short[] b = new short[256];
    public long d = 0;

    public rcq(Random random) {
        this.c = (random.nextInt() & (-33686019)) | R.attr.cacheColorHint;
    }
}
