package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.cpa;
import defpackage.cqc;
import defpackage.cqr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Barrier extends cqc {
    public int a;
    public cpa b;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // defpackage.cqc
    protected final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.b = new cpa();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cqr.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.a = typedArrayObtainStyledAttributes.getInt(26, 0);
                } else if (index == 25) {
                    this.b.b = typedArrayObtainStyledAttributes.getBoolean(25, true);
                } else if (index == 27) {
                    this.b.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(27, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.i = this.b;
        k();
    }

    public final void b(int i) {
        this.b.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // defpackage.cqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.cpd r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.a
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
            boolean r7 = r6 instanceof defpackage.cpa
            if (r7 == 0) goto L1e
            cpa r6 = (defpackage.cpa) r6
            r6.a = r0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.c(cpd, boolean):void");
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
