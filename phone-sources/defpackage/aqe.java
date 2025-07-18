package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqe extends ViewGroup {
    public final int a;
    public final List b;
    public final List c;
    public int d;
    public final bhi e;

    public aqe(Context context) {
        super(context);
        this.a = 5;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        this.e = new bhi((byte[]) null, (char[]) null);
        setClipChildren(false);
        aqf aqfVar = new aqf(context);
        addView(aqfVar);
        arrayList.add(aqfVar);
        arrayList2.add(aqfVar);
        this.d = 1;
        setTag(R.id.hide_in_inspector_tag, true);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
