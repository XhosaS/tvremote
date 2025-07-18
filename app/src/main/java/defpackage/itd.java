package defpackage;

import android.media.AudioManager;
import j$.time.Duration;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itd implements ism {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/smarthome/schemabuilders/VolumeSchemaBuilder");
    private static final Duration b;
    private final agow c;
    private final gxt d;
    private final String e;
    private final boolean f;

    static {
        Duration durationOfMillis = Duration.ofMillis(-1L);
        durationOfMillis.getClass();
        b = durationOfMillis;
    }

    public itd(AudioManager audioManager, agow agowVar, gxt gxtVar) {
        agowVar.getClass();
        this.c = agowVar;
        this.d = gxtVar;
        this.e = "action.devices.traits.Volume";
        this.f = !audioManager.isVolumeFixed();
    }

    @Override // defpackage.ism
    public final Object a(agsw agswVar) {
        gxt gxtVar = this.d;
        int iA = gxtVar.a();
        int iE = iA / gxtVar.e();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        abat abatVar = abat.a;
        linkedHashMap.put("commandOnlyVolume", abatVar);
        linkedHashMap.put("enableVolumeWith", abatVar);
        linkedHashMap.put("volumeCanMuteAndUnmute", abatVar);
        linkedHashMap.put("volumeMaxLevel", abatVar);
        linkedHashMap.put("levelStepSize", abatVar);
        linkedHashMap.put("volumeSupportsSetVolume", abatVar);
        fnj fnjVarF = gxtVar.f();
        int iOrdinal = fnjVarF.ordinal();
        if (iOrdinal == 2) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/smarthome/schemabuilders/VolumeSchemaBuilder", "buildAttributesMap", 52, "VolumeSchemaBuilder.kt")).u("Volume type changed to IR");
            linkedHashMap.put("enableVolumeWith", new abax("TV"));
            linkedHashMap.put("volumeSupportsSetVolume", new abax((Object) false));
        } else if (iOrdinal != 3) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/smarthome/schemabuilders/VolumeSchemaBuilder", "buildAttributesMap", 62, "VolumeSchemaBuilder.kt")).u("Volume type changed to SOFTWARE");
            linkedHashMap.put("volumeCanMuteAndUnmute", new abax((Object) true));
            linkedHashMap.put("volumeMaxLevel", new abax(new Integer(iA)));
            linkedHashMap.put("volumeSupportsSetVolume", new abax((Object) true));
            linkedHashMap.put("levelStepSize", new abax(new Integer(iE)));
        } else {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/smarthome/schemabuilders/VolumeSchemaBuilder", "buildAttributesMap", 57, "VolumeSchemaBuilder.kt")).u("Volume type changed to CEC");
            linkedHashMap.put("volumeCanMuteAndUnmute", new abax((Object) true));
            linkedHashMap.put("volumeSupportsSetVolume", new abax((Object) false));
        }
        Object objA = this.c.a();
        objA.getClass();
        Duration durationB = acbh.b((abwf) objA);
        durationB.getClass();
        linkedHashMap.put("commandOnlyVolume", new abax(Boolean.valueOf(gxv.a(fnjVarF, agvy.c(durationB, b)))));
        return linkedHashMap;
    }

    @Override // defpackage.ism
    public final String b() {
        return this.e;
    }

    @Override // defpackage.ism
    public final boolean c() {
        return this.f;
    }
}
