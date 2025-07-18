package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.aag;
import defpackage.yj;
import defpackage.zp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Barrier extends zp {
    public yj a;
    private int i;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.zp
    protected final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.a = new yj();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, aag.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(26, 0));
                } else if (index == 25) {
                    this.a.b = typedArrayObtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.a.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.h = this.a;
        j();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // defpackage.zp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.yn r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.i
            r1 = 1
            r2 = 0
            r3 = 6
            r4 = 5
            if (r7 == 0) goto Lf
            if (r0 != r4) goto Lc
        La:
            r0 = r1
            goto L16
        Lc:
            if (r0 != r3) goto L16
            goto L11
        Lf:
            if (r0 != r4) goto L13
        L11:
            r0 = r2
            goto L16
        L13:
            if (r0 != r3) goto L16
            goto La
        L16:
            boolean r7 = r6 instanceof defpackage.yj
            if (r7 == 0) goto L1e
            yj r6 = (defpackage.yj) r6
            r6.a = r0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.b(yn, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.a.b;
    }

    public int getMargin() {
        return this.a.c;
    }

    public int getType() {
        return this.i;
    }

    public void setDpMargin(int i) {
        this.a.c = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.a.c = i;
    }

    public void setType(int i) {
        this.i = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }
}
