package defpackage;

import android.content.res.Resources;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class quq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public quq(int i, int i2, int i3, int i4, int i5) {
        this.e = i;
        this.d = i2;
        this.c = i3;
        this.a = i4;
        this.b = i5;
    }

    public static zft e(Resources resources) {
        return new zft(new quq(resources));
    }

    private final int f(int i, int i2) {
        return i >= this.b ? this.d : i >= i2 ? this.c : this.e;
    }

    public final int a(int i) {
        return (i - (d(i) * 4)) - 2;
    }

    public final int b(int i) {
        return i + (c(i) * 4) + 2;
    }

    public final int c(int i) {
        return f(i, this.a);
    }

    final int d(int i) {
        return f(i, b(this.a));
    }

    public quq(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring);
        this.b = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring);
        this.d = resources.getDimensionPixelSize(R.dimen.og_apd_legacy_large_ring_width);
        this.c = resources.getDimensionPixelSize(R.dimen.og_apd_large_ring_width);
        this.e = resources.getDimensionPixelSize(R.dimen.og_apd_small_ring_width);
    }
}
