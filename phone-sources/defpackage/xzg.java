package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.TypedValue;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.videos.R;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzg {
    public Object a;

    public xzg() {
    }

    public final InputStream a() {
        Object obj = this.a;
        this.a = null;
        return (InputStream) obj;
    }

    public final void b() {
        this.a = null;
    }

    public final int c(vro vroVar) {
        vroVar.getClass();
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalArgumentException("Color resolver not bound to Context. ");
        }
        Object obj2 = ((qyr) obj).b.get(vroVar);
        if (obj2 != null) {
            return ((Number) obj2).intValue();
        }
        throw new IllegalArgumentException(String.valueOf(vroVar.name()).concat(" Failed to resolve."));
    }

    public final void d(Context context) {
        Integer numH;
        TypedValue typedValue = new TypedValue();
        boolean z = false;
        if (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) {
            z = true;
        }
        List list = qyq.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(ykn.j(yfm.e(yfm.z(list, 10)), 16));
        ygm ygmVar = new ygm((ygp) list);
        while (ygmVar.hasNext()) {
            Object next = ygmVar.next();
            switch ((vro) next) {
                case COLOR_UNSPECIFIED:
                case UNRECOGNIZED:
                    numH = null;
                    break;
                case ON_SURFACE:
                    numH = sip.h(context, R.attr.colorOnSurface);
                    break;
                case ON_SURFACE_VARIANT:
                    numH = sip.h(context, R.attr.colorOnSurfaceVariant);
                    break;
                case ON_PRIMARY:
                    numH = sip.h(context, R.attr.colorOnPrimary);
                    break;
                case PRIMARY:
                    numH = sip.h(context, R.attr.colorPrimary);
                    break;
                case ERROR:
                    numH = sip.h(context, R.attr.colorError);
                    break;
                case YELLOW:
                    numH = Integer.valueOf(context.getColor(true != z ? R.color.gm3_ref_palette_yellow90 : R.color.gm3_ref_palette_yellow70));
                    break;
                case ERROR_CONTAINER:
                    numH = sip.h(context, R.attr.colorErrorContainer);
                    break;
                case ON_ERROR_CONTAINER:
                    numH = sip.h(context, R.attr.colorOnErrorContainer);
                    break;
                case SURFACE_CONTAINER_LOWEST:
                    numH = sip.h(context, R.attr.colorSurfaceContainerLowest);
                    break;
                case SURFACE_CONTAINER:
                    numH = sip.h(context, R.attr.colorSurfaceContainer);
                    break;
                case ON_ERROR:
                    numH = sip.h(context, R.attr.colorOnError);
                    break;
                case CRITICAL_ALERT_BACKGROUND_COLOR:
                    numH = Integer.valueOf(context.getColor(true != z ? R.color.gm3_ref_palette_error20 : R.color.gm3_ref_palette_error80));
                    break;
                case STATIC_TERTIARY:
                    numH = Integer.valueOf(context.getColor(true != z ? R.color.gm3_sys_color_dark_tertiary : R.color.gm3_sys_color_light_tertiary));
                    break;
                case SURFACE_VARIANT:
                    numH = sip.h(context, R.attr.colorSurfaceVariant);
                    break;
                case PRIMARY_CONTAINER:
                    numH = sip.h(context, R.attr.colorPrimaryContainer);
                    break;
                default:
                    throw new yfu();
            }
            linkedHashMap.put(next, numH);
        }
        this.a = new qyr(z, linkedHashMap);
    }

    public final boolean e() {
        Object obj = this.a;
        if (obj != null) {
            return ((qyr) obj).a;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yrz] */
    public final void f(voy voyVar) {
        ((ulo) this.a).b.b(voyVar);
    }

    public final void g(Intent intent, qxm qxmVar) {
        Object obj = this.a;
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        qxr qxrVar = (qxr) obj;
        qxrVar.d = qxmVar;
        gp gpVar = qxrVar.g;
        if (gpVar == null) {
            qxrVar.h.startActivity(intent);
        } else {
            gpVar.b(intent);
        }
    }

    public xzg(InputStream inputStream) {
        this.a = inputStream;
    }

    public xzg(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ulo((byte[]) null);
    }

    public xzg(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.d = SwipeDismissBehavior.E(0.1f);
        swipeDismissBehavior.e = SwipeDismissBehavior.E(0.6f);
        swipeDismissBehavior.c = 0;
    }
}
