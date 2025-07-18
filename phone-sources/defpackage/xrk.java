package defpackage;

import android.graphics.Matrix;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xrk {
    public Object a;
    public Object b;
    private final Object c;

    public xrk(TextView textView) {
        this.a = trk.a;
        this.b = ImmutableList.of();
        this.c = textView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    private final void l(final float f) {
        String str = (String) Iterables.getLast(this.b, null);
        if (f > 0.0f && Iterables.size(this.b) > 1) {
            final TextPaint paint = ((TextView) this.c).getPaint();
            str = (String) Iterables.tryFind(this.b, new tsv() { // from class: rid
                @Override // defpackage.tsv
                public final boolean apply(Object obj) {
                    return paint.measureText((String) obj) <= f;
                }
            }).a(tst.h(str)).f();
        }
        if (str == null || !str.contentEquals(((TextView) this.c).getText())) {
            ((TextView) this.c).setText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final xrm a() {
        return new xrm(this.a, (xpv) this.c, (Object[][]) this.b);
    }

    public final void b(xrl xrlVar, Object obj) {
        int length = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.b;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (xrlVar.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object obj2 = this.b;
            int length2 = ((Object[][]) obj2).length;
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, length2 + 1, 2);
            System.arraycopy(obj2, 0, objArr2, 0, length2);
            this.b = objArr2;
            length = objArr2.length - 1;
        }
        ((Object[][]) this.b)[length] = new Object[]{xrlVar, obj};
    }

    public final void c(List list) {
        sij.o(!list.isEmpty(), "addrs is empty");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public final void d(float f) {
        float[] fArr = (float[]) this.b;
        double dAtan2 = Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d;
        double d = (float) dAtan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r0[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r12[1] + (d2 * Math.sin(d)));
    }

    public final void e(float f) {
        float[] fArr = (float[]) this.b;
        float fAtan2 = (float) Math.atan2(fArr[1], fArr[0]);
        double d = fAtan2;
        double d2 = f;
        ((float[]) this.a)[0] = (float) (r2[0] + (Math.cos(d) * d2));
        ((float[]) this.a)[1] = (float) (r14[1] + (d2 * Math.sin(d)));
    }

    public final void f() {
        Arrays.fill((float[]) this.a, 0.0f);
        Arrays.fill((float[]) this.b, 0.0f);
        ((float[]) this.b)[0] = 1.0f;
        ((Matrix) this.c).reset();
    }

    public final void g(float f) {
        Matrix matrix = (Matrix) this.c;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints((float[]) this.a);
        matrix.mapPoints((float[]) this.b);
    }

    public final void h(float f) {
        float[] fArr = (float[]) this.a;
        float f2 = fArr[0];
        fArr[1] = fArr[1] * f;
        float[] fArr2 = (float[]) this.b;
        float f3 = fArr2[0];
        fArr2[1] = fArr2[1] * f;
    }

    public final void i(float f) {
        float[] fArr = (float[]) this.a;
        fArr[0] = fArr[0] + f;
        fArr[1] = fArr[1] + 0.0f;
    }

    public final void j(ImmutableList immutableList) {
        this.b = Iterables.filter(immutableList, new mcp(5));
        if (((tst) this.a).g()) {
            l(((Float) ((tst) this.a).c()).floatValue());
        }
    }

    public final void k(int i) {
        Object obj = this.c;
        TextView textView = (TextView) obj;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + textView.getPaddingLeft() + textView.getPaddingRight();
        if (obj instanceof Chip) {
            srg srgVar = ((Chip) obj).e;
            paddingLeft += (srgVar != null ? srgVar.j : 0.0f) + (srgVar != null ? srgVar.k : 0.0f);
        }
        float f = i - paddingLeft;
        if (((tst) this.a).g() && f == ((Float) ((tst) this.a).c()).floatValue()) {
            return;
        }
        this.a = tst.i(Float.valueOf(f));
        l(f);
    }

    public xrk(byte[] bArr) {
        this.a = new float[2];
        this.b = new float[]{1.0f, 0.0f};
        this.c = new Matrix();
    }

    public xrk(xrk xrkVar) {
        this((float[]) xrkVar.a, (float[]) xrkVar.b);
    }

    public xrk(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.a = fArr3;
        this.b = new float[2];
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, this.b, 0, 2);
        this.c = new Matrix();
    }

    public xrk() {
        this.c = xpv.a;
        this.b = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    }
}
