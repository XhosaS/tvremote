package defpackage;

import android.R;
import android.content.Context;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bo extends ArrayAdapter {
    public bo(Context context, int i) {
        super(context, i, R.id.text1, (Object[]) null);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
