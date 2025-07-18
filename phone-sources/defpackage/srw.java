package defpackage;

import com.google.android.videos.R;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srw {
    private static final Map a;
    private static final sik b;

    static {
        sik sikVar = new sik();
        b = sikVar;
        HashMap map = new HashMap();
        map.put(Integer.valueOf(R.color.material_personalized_color_primary), sikVar.m());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary), new ssb("on_primary", new ssh(16), new ssh(17), false, new opy(sikVar, 16), new ssa(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_inverse), new ssb("inverse_primary", new ssh(18), new ssh(19), false, new ssh(20), new ssa(3.0d, 4.5d, 7.0d, 7.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_primary_container), sikVar.n());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_primary_container), new ssb("on_primary_container", new ssi(5), new opy(sikVar, 19), false, new opy(sikVar, 20), new ssa(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary), sikVar.o());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary), new ssb("on_secondary", new nrc(16), new nrc(17), false, new opy(sikVar, 3), new ssa(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_secondary_container), sikVar.p());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_secondary_container), new ssb("on_secondary_container", new ssf(7), new opy(sikVar, 7), false, new opy(sikVar, 8), new ssa(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary), sikVar.q());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary), new ssb("on_tertiary", new ssh(11), new ssi(1), false, new opy(sikVar, 17), new ssa(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_tertiary_container), sikVar.r());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_tertiary_container), new ssb("on_tertiary_container", new ssf(6), new opy(sikVar, 5), false, new opy(sikVar, 6), new ssa(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_background), sik.u());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_background), new ssb("on_background", new ssh(8), new ssh(9), false, new ssh(10), new ssa(3.0d, 3.0d, 4.5d, 7.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface), new ssb("surface", new nrc(15), new ssg(13), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface), new ssb("on_surface", new ssi(6), new ssi(12), false, new ssi(16), new ssa(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_variant), new ssb("surface_variant", new ssi(7), new ssi(8), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_variant), new ssb("on_surface_variant", new ssf(15), new ssf(16), false, new ssi(16), new ssa(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_inverse), sik.v());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_surface_inverse), new ssb("inverse_on_surface", new ssf(3), new ssf(4), false, new ssf(5), new ssa(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_bright), sik.w());
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_dim), sik.x());
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container), new ssb("surface_container", new ssf(13), new ssf(14), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_low), new ssb("surface_container_low", new ssg(14), new ssg(15), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_high), new ssb("surface_container_high", new ssh(6), new ssh(7), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_lowest), new ssb("surface_container_lowest", new nrc(20), new ssf(1), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_surface_container_highest), new ssb("surface_container_highest", new ssi(11), new ssi(13), true, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline), new ssb("outline", new ssf(0), new ssf(2), false, new ssi(16), new ssa(1.5d, 3.0d, 4.5d, 7.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_outline_variant), new ssb("outline_variant", new ssh(12), new ssh(13), false, new ssi(16), new ssa(1.0d, 1.0d, 3.0d, 4.5d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error), sikVar.k());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error), new ssb("on_error", new ssi(0), new ssi(2), false, new opy(sikVar, 18), new ssa(4.5d, 7.0d, 11.0d, 21.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_error_container), sikVar.l());
        map.put(Integer.valueOf(R.color.material_personalized_color_on_error_container), new ssb("on_error_container", new ssf(20), new ssg(1), false, new opy(sikVar, 10), new ssa(3.0d, 4.5d, 7.0d, 11.0d), null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_activated), new ssb("control_activated", new ssg(11), new ssg(12), false, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_normal), new ssb("control_normal", new ssg(5), new ssg(8), false, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_control_highlight), new ssb(new ssg(19), new ssg(20), new ssh(1)));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse), new ssb("text_primary_inverse", new ssf(11), new ssf(12), false, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse), new ssb("text_secondary_and_tertiary_inverse", new ssg(0), new ssg(2), false, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_secondary_and_tertiary_inverse_disabled), new ssb("text_secondary_and_tertiary_inverse_disabled", new ssg(18), new ssh(0), false, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_primary_inverse_disable_only), new ssb("text_primary_inverse_disable_only", new ssi(3), new ssi(4), false, null, null, null));
        map.put(Integer.valueOf(R.color.material_personalized_color_text_hint_foreground_inverse), new ssb("text_hint_inverse", new ssi(9), new ssi(10), false, null, null, null));
        a = DesugarCollections.unmodifiableMap(map);
    }

    public static Map a(ssc sscVar) {
        HashMap map = new HashMap();
        for (Map.Entry entry : a.entrySet()) {
            Integer num = (Integer) entry.getKey();
            ssb ssbVar = (ssb) entry.getValue();
            HashMap map2 = ssbVar.i;
            ssd ssdVarB = (ssd) map2.get(sscVar);
            if (ssdVarB == null) {
                ssdVarB = ((wfj) ssbVar.b.apply(sscVar)).b(ssbVar.b(sscVar));
                if (map2.size() > 4) {
                    map2.clear();
                }
                map2.put(sscVar, ssdVarB);
            }
            Function function = ssbVar.h;
            int iJ = ssdVarB.d;
            if (function != null) {
                iJ = (iJ & 16777215) | (sik.j((int) Math.round(((Double) function.apply(sscVar)).doubleValue() * 255.0d)) << 24);
            }
            map.put(num, Integer.valueOf(iJ));
        }
        return DesugarCollections.unmodifiableMap(map);
    }
}
