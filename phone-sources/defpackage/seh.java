package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class seh {
    public RecyclerView.ViewHolder a;
    public RecyclerView.ViewHolder b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public seh(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        this.a = viewHolder;
        this.b = viewHolder2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        return "ChangeInfo{oldHolder=" + String.valueOf(this.a) + ", newHolder=" + String.valueOf(this.b) + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + "}";
    }
}
