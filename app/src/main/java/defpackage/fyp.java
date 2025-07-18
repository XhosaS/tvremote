package defpackage;

import com.google.android.apps.tvsearch.fcm.KatnissFcmService;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyp {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/fcm/KatnissFcmServicePeer");
    public final ahbt b;
    public final fjn c;
    public final fsv d;
    public final ffp e;
    public final KatnissFcmService f;
    public final agow g;
    public final isn h;

    public fyp(ahbt ahbtVar, fjn fjnVar, fsv fsvVar, ffp ffpVar, KatnissFcmService katnissFcmService, agow agowVar, isn isnVar) {
        ahbtVar.getClass();
        fjnVar.getClass();
        ffpVar.getClass();
        agowVar.getClass();
        isnVar.getClass();
        this.b = ahbtVar;
        this.c = fjnVar;
        this.d = fsvVar;
        this.e = ffpVar;
        this.f = katnissFcmService;
        this.g = agowVar;
        this.h = isnVar;
    }

    public final boolean a(Map map, String str) {
        if (map.containsKey(str)) {
            return true;
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/fcm/KatnissFcmServicePeer", "checkRequiredField", 139, "KatnissFcmServicePeer.kt")).x("Field '%s' missing, cannot proceed.", str);
        return false;
    }
}
