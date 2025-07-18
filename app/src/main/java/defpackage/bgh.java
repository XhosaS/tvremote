package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgh extends View implements bgr {
    private final List a;
    private List b;
    private float c;
    private bgi d;
    private float e;

    public bgh(Context context) {
        super(context, null);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = bgi.a;
        this.e = 0.08f;
    }

    @Override // defpackage.bgr
    public final void a(List list, bgi bgiVar, float f, float f2) {
        this.b = list;
        this.d = bgiVar;
        this.c = f;
        this.e = f2;
        while (true) {
            List list2 = this.a;
            if (list2.size() >= list.size()) {
                invalidate();
                return;
            }
            list2.add(new bgq(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(android.graphics.Canvas r33) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgh.dispatchDraw(android.graphics.Canvas):void");
    }
}
