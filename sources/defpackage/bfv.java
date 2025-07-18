package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import com.google.android.tv.remote.service.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public bfv() {
        this.f = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.a = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.e = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.c = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.b = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.d = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static final boolean b(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static final ColorStateList c(Context context, int i) {
        int iB = jl.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{jl.a, jl.c, jl.b, jl.e}, new int[]{jl.a(context, R.attr.colorButtonNormal), ns.c(iB, i), ns.c(iB, i), i});
    }

    public static final LayerDrawable d(jd jdVar, Context context, int i) throws Resources.NotFoundException {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableC = jdVar.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = jdVar.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static final void e(Drawable drawable, int i, PorterDuff.Mode mode) {
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = fm.a;
        }
        drawableMutate.setColorFilter(fm.b(i, mode));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [cht, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final synchronized bgc a(bft bftVar) {
        bgc bgcVar;
        ?? r0 = this.a;
        Uri uri = bftVar.a;
        bgcVar = (bgc) r0.get(uri);
        boolean z = true;
        if (bgcVar == null) {
            bdq.h(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            String strP = bdq.p(uri.getLastPathSegment());
            int iLastIndexOf = strP.lastIndexOf(46);
            bdq.h((iLastIndexOf == -1 ? "" : strP.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            bdq.f(bftVar.b != null, "Proto schema cannot be null");
            bdq.f(bftVar.c != null, "Handler cannot be null");
            bgd bgdVar = (bgd) this.f.get("singleproc");
            if (bgdVar == 0) {
                z = false;
            }
            bdq.h(z, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strP2 = bdq.p(uri.getLastPathSegment());
            int iLastIndexOf2 = strP2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strP2 = strP2.substring(0, iLastIndexOf2);
            }
            cja cjaVarI = chk.i(qm.K(uri), this.e, chz.a);
            ?? r5 = this.c;
            bfz bfzVarB = bgdVar.b(bftVar, strP2, r5, (bzt) this.d);
            bgdVar.a();
            bgc bgcVar2 = new bgc(bfzVarB, cjaVarI);
            bzs bzsVar = bftVar.d;
            if (!bzsVar.isEmpty()) {
                bgcVar2.c(new bfr(bzsVar, r5));
            }
            r0.put(uri, bgcVar2);
            this.b.put(uri, bftVar);
            bgcVar = bgcVar2;
        } else {
            bft bftVar2 = (bft) this.b.get(uri);
            if (!bftVar.equals(bftVar2)) {
                cmz cmzVar = bftVar.b;
                String strL = bit.l("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", cmzVar.getClass().getSimpleName(), uri);
                bdq.h(uri.equals(bftVar2.a), strL, "uri");
                bdq.h(cmzVar.equals(bftVar2.b), strL, "schema");
                bdq.h(bftVar.c.equals(bftVar2.c), strL, "handler");
                bdq.h(biu.h(bftVar.d, bftVar2.d), strL, "migrations");
                bdq.h(bftVar.f.equals(bftVar2.f), strL, "variantConfig");
                bdq.h(bftVar.e == bftVar2.e, strL, "useGeneratedExtensionRegistry");
                bdq.h(true, strL, "enableTracing");
                throw new IllegalArgumentException(bit.l(strL, "unknown"));
            }
        }
        return bgcVar;
    }

    public bfv(are areVar, byg bygVar, crv crvVar, crv crvVar2, crv crvVar3, crv crvVar4) {
        this.d = areVar;
        this.e = bygVar;
        this.b = crvVar;
        this.c = crvVar2;
        this.f = crvVar3;
        this.a = crvVar4;
    }

    public bfv(bfv bfvVar, cjd cjdVar, Random random, crv crvVar, crv crvVar2, crv crvVar3) {
        this.c = bfvVar;
        this.e = cjdVar;
        this.f = random;
        this.d = crvVar;
        this.a = crvVar2;
        this.b = crvVar3;
    }

    public bfv(crv crvVar, crv crvVar2, crv crvVar3, crv crvVar4, crv crvVar5, crv crvVar6) {
        crvVar.getClass();
        this.d = crvVar;
        crvVar2.getClass();
        this.b = crvVar2;
        crvVar3.getClass();
        this.c = crvVar3;
        this.a = crvVar4;
        crvVar5.getClass();
        this.e = crvVar5;
        crvVar6.getClass();
        this.f = crvVar6;
    }

    public bfv(Executor executor, bzt bztVar, Map map) {
        this.a = new HashMap();
        this.b = new HashMap();
        executor.getClass();
        this.c = executor;
        bztVar.getClass();
        this.d = bztVar;
        this.f = map;
        bdq.e(!map.isEmpty());
        this.e = new bfu(0);
    }
}
