package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.katniss.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ra {
    private static ra b;
    private WeakHashMap d;
    private final WeakHashMap e = new WeakHashMap(0);
    private TypedValue f;
    private boolean g;
    private qz h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final qy c = new qy();

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        qy qyVar = c;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) qyVar.e(Integer.valueOf(qy.a(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        return porterDuffColorFilter2;
    }

    public static synchronized ra e() {
        if (b == null) {
            b = new ra();
        }
        return b;
    }

    static void h(Drawable drawable, rt rtVar, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        PorterDuffColorFilter porterDuffColorFilterB = null;
        if (rtVar.d) {
            colorStateList = rtVar.a;
        } else {
            if (!rtVar.c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = rtVar.c ? rtVar.b : a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterB);
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        wr wrVar = (wr) this.e.get(context);
        if (wrVar != null && (weakReference = (WeakReference) wrVar.e(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            wrVar.j(j);
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.e;
            wr wrVar = (wr) weakHashMap.get(context);
            if (wrVar == null) {
                wrVar = new wr(10);
                weakHashMap.put(context, wrVar);
            }
            wrVar.i(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        wy wyVar;
        WeakHashMap weakHashMap = this.d;
        ColorStateList colorStateListB = null;
        ColorStateList colorStateList = (weakHashMap == null || (wyVar = (wy) weakHashMap.get(context)) == null) ? null : (ColorStateList) wz.a(wyVar, i);
        if (colorStateList == null) {
            qz qzVar = this.h;
            if (qzVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateListB = abs.b(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListB = abs.b(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListC = rq.c(context, R.attr.colorSwitchThumbNormal);
                    if (colorStateListC == null || !colorStateListC.isStateful()) {
                        iArr[0] = rq.a;
                        iArr2[0] = rq.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = rq.d;
                        iArr2[1] = rq.b(context, R.attr.colorControlActivated);
                        iArr[2] = rq.e;
                        iArr2[2] = rq.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = rq.a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                        iArr[1] = rq.d;
                        iArr2[1] = rq.b(context, R.attr.colorControlActivated);
                        iArr[2] = rq.e;
                        iArr2[2] = colorStateListC.getDefaultColor();
                    }
                    colorStateListB = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateListB = ((lk) qzVar).a(context, rq.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateListB = ((lk) qzVar).a(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateListB = ((lk) qzVar).a(context, rq.b(context, R.attr.colorAccent));
                } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    colorStateListB = abs.b(context, R.color.abc_tint_spinner);
                } else if (((lk) qzVar).d(((lk) qzVar).b, i)) {
                    colorStateListB = rq.c(context, R.attr.colorControlNormal);
                } else if (((lk) qzVar).d(((lk) qzVar).e, i)) {
                    colorStateListB = abs.b(context, R.color.abc_tint_default);
                } else if (((lk) qzVar).d(((lk) qzVar).f, i)) {
                    colorStateListB = abs.b(context, R.color.abc_tint_btn_checkable);
                } else if (i == R.drawable.abc_seekbar_thumb_material) {
                    colorStateListB = abs.b(context, R.color.abc_tint_seek_thumb);
                    i = R.drawable.abc_seekbar_thumb_material;
                }
            }
            if (colorStateListB != null) {
                if (this.d == null) {
                    this.d = new WeakHashMap();
                }
                wy wyVar2 = (wy) this.d.get(context);
                if (wyVar2 == null) {
                    wyVar2 = new wy(10);
                    this.d.put(context, wyVar2);
                }
                int i2 = wyVar2.d;
                if (i2 == 0 || i > wyVar2.b[i2 - 1]) {
                    if (wyVar2.a && i2 >= wyVar2.b.length) {
                        wz.c(wyVar2);
                    }
                    int i3 = wyVar2.d;
                    int[] iArr4 = wyVar2.b;
                    if (i3 >= iArr4.length) {
                        int iD = xa.d(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(iArr4, iD);
                        iArrCopyOf.getClass();
                        wyVar2.b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(wyVar2.c, iD);
                        objArrCopyOf.getClass();
                        wyVar2.c = objArrCopyOf;
                    }
                    wyVar2.b[i3] = i;
                    wyVar2.c[i3] = colorStateListB;
                    wyVar2.d = i3 + 1;
                } else {
                    wyVar2.f(i, colorStateListB);
                }
                return colorStateListB;
            }
            colorStateList = colorStateListB;
        }
        return colorStateList;
    }

    public final synchronized Drawable c(Context context, int i) {
        return d(context, i, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab A[Catch: all -> 0x01d5, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:18:0x005b, B:31:0x00a8, B:23:0x0066, B:25:0x0083, B:27:0x008f, B:29:0x009b, B:33:0x00b2, B:35:0x00b8, B:37:0x00be, B:44:0x00d3, B:82:0x01c6, B:42:0x00cf, B:46:0x00d9, B:50:0x00f0, B:54:0x0126, B:56:0x0158, B:75:0x01ab, B:77:0x01bc, B:61:0x016d, B:64:0x017d, B:66:0x018d, B:69:0x0195, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:85:0x01cb, B:86:0x01d4), top: B:90:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ra.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        wr wrVar = (wr) this.e.get(context);
        if (wrVar != null) {
            wrVar.h();
        }
    }

    public final synchronized void g(qz qzVar) {
        this.h = qzVar;
    }
}
