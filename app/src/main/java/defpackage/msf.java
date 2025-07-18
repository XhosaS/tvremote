package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public class msf {
    msf f;
    public final /* synthetic */ msh g;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    private int h = 0;
    public final ArrayList e = new ArrayList();

    public msf(msh mshVar) {
        this.g = mshVar;
    }

    private final int d(View view, int i) {
        msh mshVar = this.g;
        pg pgVar = mshVar.i;
        pgVar.getClass();
        int i2 = mshVar.l;
        int i3 = this.a;
        if (i2 == 0) {
            throw null;
        }
        int i4 = i2 - 1;
        if (i4 == 1) {
            if (i == -1) {
                return i3 - pgVar.b(view);
            }
            return 0;
        }
        if (i4 != 2) {
            return (i3 - pgVar.b(view)) / 2;
        }
        if (i != -1) {
            return i3 - pgVar.b(view);
        }
        return 0;
    }

    final int a() {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            return -1;
        }
        return ((mse) zag.e(arrayList)).a;
    }

    public final void b(msl mslVar, FlowLayoutManager flowLayoutManager, boolean z, boolean z2) {
        int iB;
        int i;
        int iB2;
        int iB3;
        int iD;
        int iD2;
        int i2;
        msf msfVarB;
        int i3;
        FlowLayoutManager flowLayoutManager2 = flowLayoutManager;
        msh mshVar = this.g;
        pg pgVar = mshVar.i;
        pgVar.getClass();
        int i4 = -1;
        if (mslVar.e == -1) {
            Collections.reverse(this.e);
        }
        ArrayList arrayList = this.e;
        if (!arrayList.isEmpty()) {
            int i5 = 1;
            if (arrayList.size() <= 1 || mshVar.c != -1) {
                this.h = mshVar.b;
            } else {
                int iFloor = (int) Math.floor((mshVar.a(flowLayoutManager2) - this.d) / (arrayList.size() - 1));
                this.h = iFloor;
                int i6 = mshVar.b;
                if (iFloor < i6) {
                    this.h = i6;
                }
            }
            if (z2 && (msfVarB = mshVar.b(((mse) arrayList.get(0)).a - 1)) != null) {
                ArrayList arrayList2 = msfVarB.e;
                yqw.L(!arrayList2.isEmpty());
                if (arrayList2.size() > arrayList.size() && (i3 = msfVarB.h) > 0) {
                    this.h = i3;
                }
            }
            int paddingRight = mshVar.j == 1 ? z ? flowLayoutManager2.getPaddingRight() : flowLayoutManager2.getPaddingLeft() : flowLayoutManager2.getPaddingTop();
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                mse mseVar = (mse) arrayList.get(i7);
                int iB4 = paddingRight;
                View view = mseVar.c;
                view.getClass();
                mshVar.i.getClass();
                if (mshVar.j == i5) {
                    if (z) {
                        iB2 = flowLayoutManager2.H - iB4;
                        iB4 = iB2 - pgVar.c(view);
                        i2 = (flowLayoutManager2.H - iB4) + this.h;
                    } else {
                        iB2 = pgVar.c(view) + iB4;
                        i2 = this.h + iB2;
                    }
                    int i8 = mslVar.f;
                    if (i8 == i4) {
                        int iD3 = (mslVar.b - d(view, i4)) - mshVar.a;
                        iB3 = iB4;
                        iB4 = iD3 - pgVar.b(view);
                        iB = iD3;
                    } else {
                        int iD4 = d(view, i8) + mslVar.b;
                        iB = pgVar.b(view) + iD4;
                        iB3 = iB4;
                        iB4 = iD4;
                    }
                    i = i2;
                } else {
                    int iC = iB4 + pgVar.c(view);
                    int i9 = this.h + iC;
                    int i10 = mslVar.f;
                    if (i10 == i4) {
                        if (mslVar.e == i4) {
                            iD = mslVar.b - d(view, i4);
                            iD2 = mshVar.a;
                        } else {
                            iD = mslVar.b;
                            iD2 = d(view, i4);
                        }
                        int i11 = iD - iD2;
                        iB3 = i11 - pgVar.b(view);
                        iB = iC;
                        i = i9;
                        iB2 = i11;
                    } else {
                        int iD5 = d(view, i10) + mslVar.b;
                        iB = iC;
                        i = i9;
                        iB2 = pgVar.b(view) + iD5;
                        iB3 = iD5;
                    }
                }
                int i12 = iB;
                mseVar.b = new Rect(iB3, iB4, iB2, i12);
                flowLayoutManager2.aR(view, iB3, iB4, iB2, i12);
                i7++;
                flowLayoutManager2 = flowLayoutManager;
                paddingRight = i;
                i4 = -1;
                i5 = 1;
            }
            this.a += z2 ? 0 : mshVar.a;
        }
        msg msgVar = mshVar.e;
        if (arrayList.isEmpty()) {
            return;
        }
        msgVar.d.add(this);
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            mse mseVar2 = (mse) arrayList.get(i13);
            msgVar.e.put(Integer.valueOf(mseVar2.a), this);
            mseVar2.c = null;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.view.View r9, int r10, defpackage.qd r11, defpackage.msl r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msf.c(android.view.View, int, qd, msl, boolean):boolean");
    }
}
