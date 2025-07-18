package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.slice.SliceItem;
import com.google.android.katniss.R;
import defpackage.aff;
import defpackage.afg;
import defpackage.bqx;
import defpackage.bqz;
import defpackage.brh;
import java.util.ArrayDeque;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridRowView extends brh implements View.OnClickListener, View.OnTouchListener {
    protected final View a;
    protected final LinearLayout b;
    private final int[] c;

    public GridRowView(Context context) {
        this(context, null);
    }

    @Override // defpackage.brh
    public int getHiddenItemCount() {
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws PendingIntent.CanceledException {
        Pair pair = (Pair) view.getTag();
        SliceItem sliceItem = (SliceItem) pair.first;
        if (sliceItem != null) {
            SliceItem sliceItem2 = null;
            String[] strArr = {null};
            String[] strArr2 = {null};
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(sliceItem);
            while (true) {
                if (arrayDeque.isEmpty()) {
                    break;
                }
                SliceItem sliceItem3 = (SliceItem) arrayDeque.poll();
                if ("action".equals(sliceItem3.b)) {
                    String str = strArr[0];
                    if (TextUtils.isEmpty(str) || bqx.a(sliceItem3.a, str)) {
                        if (!bqx.a(sliceItem3.a, strArr2[0])) {
                            sliceItem2 = sliceItem3;
                            break;
                        }
                    }
                }
                if (sliceItem3 != null && ("slice".equals(sliceItem3.b) || "action".equals(sliceItem3.b))) {
                    Collections.addAll(arrayDeque, sliceItem3.c().d);
                }
            }
            if (sliceItem2 != null) {
                try {
                    aff.a(sliceItem2.d, "Object must be non-null for FORMAT_ACTION");
                    Object obj = ((afg) sliceItem2.d).a;
                    if (obj instanceof PendingIntent) {
                        ((PendingIntent) obj).send(null, 0, null, null, null);
                    } else {
                        ((bqz) obj).a();
                    }
                } catch (PendingIntent.CanceledException e) {
                    Log.e("GridRowView", "PendingIntent for slice cannot be sent", e);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        throw null;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = this.a;
        view2.getLocationOnScreen(this.c);
        view2.getBackground().setHotspot((int) (motionEvent.getRawX() - r0[0]), (int) (motionEvent.getRawY() - r0[1]));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            view2.setPressed(true);
        } else if (actionMasked == 3 || actionMasked == 1 || actionMasked == 2) {
            view2.setPressed(false);
        }
        return false;
    }

    public GridRowView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.c = new int[2];
        Resources resources = getContext().getResources();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        linearLayout.setGravity(16);
        resources.getDimensionPixelSize(R.dimen.abc_slice_icon_size);
        resources.getDimensionPixelSize(R.dimen.abc_slice_small_image_size);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_only_height);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_image_min_width);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_gutter);
        resources.getDimensionPixelSize(R.dimen.abc_slice_grid_text_padding);
        View view = new View(getContext());
        this.a = view;
        addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // defpackage.brh
    public void setTint(int i) {
    }
}
