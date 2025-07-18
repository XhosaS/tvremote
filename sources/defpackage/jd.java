package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.tv.remote.service.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jd {
    private static jd b;
    private WeakHashMap c;
    private final WeakHashMap d = new WeakHashMap(0);
    private TypedValue e;
    private boolean f;
    private bfv h;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final mh g = new mh(6);

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        mh mhVar = g;
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) mhVar.a(Integer.valueOf(mh.c(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i, mode);
        return porterDuffColorFilter2;
    }

    public static synchronized jd e() {
        if (b == null) {
            b = new jd();
        }
        return b;
    }

    static void g(Drawable drawable, jo joVar, int[] iArr) {
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
        if (joVar.d) {
            colorStateList = joVar.a;
        } else {
            if (!joVar.c) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = joVar.c ? joVar.b : a;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterB = b(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterB);
    }

    private final synchronized Drawable i(Context context, long j) {
        WeakReference weakReference;
        mf mfVar = (mf) this.d.get(context);
        if (mfVar != null && (weakReference = (WeakReference) mfVar.b(j)) != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int iB = ml.b(mfVar.b, mfVar.d, j);
            if (iB >= 0) {
                Object[] objArr = mfVar.c;
                Object obj = objArr[iB];
                Object obj2 = mg.a;
                if (obj != obj2) {
                    objArr[iB] = obj2;
                    mfVar.a = true;
                }
            }
        }
        return null;
    }

    private final synchronized void j(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.d;
            mf mfVar = (mf) weakHashMap.get(context);
            if (mfVar == null) {
                mfVar = new mf();
                weakHashMap.put(context, mfVar);
            }
            mfVar.e(j, new WeakReference(constantState));
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        mj mjVar;
        WeakHashMap weakHashMap = this.c;
        ColorStateList colorStateListB = null;
        ColorStateList colorStateList = (weakHashMap == null || (mjVar = (mj) weakHashMap.get(context)) == null) ? null : (ColorStateList) mk.a(mjVar, i);
        if (colorStateList == null) {
            bfv bfvVar = this.h;
            if (bfvVar != null) {
                if (i == R.drawable.abc_edit_text_material) {
                    colorStateListB = nf.b(context, R.color.abc_tint_edittext);
                } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                    colorStateListB = nf.b(context, R.color.abc_tint_switch_track);
                } else if (i == R.drawable.abc_switch_thumb_material) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList colorStateListC = jl.c(context, R.attr.colorSwitchThumbNormal);
                    if (colorStateListC == null || !colorStateListC.isStateful()) {
                        iArr[0] = jl.a;
                        iArr2[0] = jl.a(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = jl.d;
                        iArr2[1] = jl.b(context, R.attr.colorControlActivated);
                        iArr[2] = jl.e;
                        iArr2[2] = jl.b(context, R.attr.colorSwitchThumbNormal);
                    } else {
                        int[] iArr3 = jl.a;
                        iArr[0] = iArr3;
                        iArr2[0] = colorStateListC.getColorForState(iArr3, 0);
                        iArr[1] = jl.d;
                        iArr2[1] = jl.b(context, R.attr.colorControlActivated);
                        iArr[2] = jl.e;
                        iArr2[2] = colorStateListC.getDefaultColor();
                    }
                    colorStateListB = new ColorStateList(iArr, iArr2);
                } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
                    colorStateListB = bfv.c(context, jl.b(context, R.attr.colorButtonNormal));
                } else if (i == R.drawable.abc_btn_borderless_material) {
                    colorStateListB = bfv.c(context, 0);
                } else if (i == R.drawable.abc_btn_colored_material) {
                    colorStateListB = bfv.c(context, jl.b(context, R.attr.colorAccent));
                } else if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                    colorStateListB = nf.b(context, R.color.abc_tint_spinner);
                } else if (bfv.b((int[]) bfvVar.a, i)) {
                    colorStateListB = jl.c(context, R.attr.colorControlNormal);
                } else if (bfv.b((int[]) bfvVar.b, i)) {
                    colorStateListB = nf.b(context, R.color.abc_tint_default);
                } else if (bfv.b((int[]) bfvVar.d, i)) {
                    colorStateListB = nf.b(context, R.color.abc_tint_btn_checkable);
                } else if (i == R.drawable.abc_seekbar_thumb_material) {
                    colorStateListB = nf.b(context, R.color.abc_tint_seek_thumb);
                    i = R.drawable.abc_seekbar_thumb_material;
                }
            }
            if (colorStateListB != null) {
                if (this.c == null) {
                    this.c = new WeakHashMap();
                }
                mj mjVar2 = (mj) this.c.get(context);
                if (mjVar2 == null) {
                    mjVar2 = new mj();
                    this.c.put(context, mjVar2);
                }
                int i2 = mjVar2.d;
                if (i2 == 0 || i > mjVar2.b[i2 - 1]) {
                    if (mjVar2.a && i2 >= mjVar2.b.length) {
                        mk.b(mjVar2);
                    }
                    int i3 = mjVar2.d;
                    int[] iArr4 = mjVar2.b;
                    if (i3 >= iArr4.length) {
                        int iD = ml.d(i3 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(iArr4, iD);
                        iArrCopyOf.getClass();
                        mjVar2.b = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(mjVar2.c, iD);
                        objArrCopyOf.getClass();
                        mjVar2.c = objArrCopyOf;
                    }
                    mjVar2.b[i3] = i;
                    mjVar2.c[i3] = colorStateListB;
                    mjVar2.d = i3 + 1;
                } else {
                    mjVar2.d(i, colorStateListB);
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b A[Catch: all -> 0x01b5, TryCatch #0 {, blocks: (B:4:0x0007, B:13:0x002d, B:15:0x0031, B:16:0x0038, B:34:0x00ad, B:36:0x00b3, B:38:0x00b9, B:45:0x00ce, B:83:0x01a6, B:43:0x00ca, B:47:0x00d4, B:51:0x00eb, B:55:0x0119, B:57:0x0143, B:76:0x018b, B:78:0x019c, B:62:0x0154, B:65:0x0160, B:67:0x016d, B:70:0x0175, B:19:0x005c, B:32:0x00a3, B:24:0x0067, B:26:0x0084, B:28:0x008e, B:30:0x0098, B:7:0x000e, B:9:0x0019, B:11:0x001d, B:86:0x01ab, B:87:0x01b4), top: B:91:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized android.graphics.drawable.Drawable d(android.content.Context r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd.d(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void f(Context context) {
        mf mfVar = (mf) this.d.get(context);
        if (mfVar != null) {
            mfVar.d();
        }
    }

    public final synchronized void h(bfv bfvVar) {
        this.h = bfvVar;
    }
}
