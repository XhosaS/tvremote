package defpackage;

import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isk implements isp {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/smarthome/executors/TransportControlExecutor");
    private final god b;
    private final Set c = agqj.p(new String[]{"action.devices.commands.mediaNext", "action.devices.commands.mediaPrevious", "action.devices.commands.mediaPause", "action.devices.commands.mediaStop", "action.devices.commands.mediaResume", "action.devices.commands.mediaSeekToPosition", "action.devices.commands.mediaSeekRelative"});

    public isk(god godVar) {
        this.b = godVar;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        ((zdv) a.b().q("com/google/android/apps/tvsearch/smarthome/executors/TransportControlExecutor", "execute", 16, "TransportControlExecutor.kt")).F("Received command: '%s' with params '%s'", str, abauVar);
        switch (str.hashCode()) {
            case -964213213:
                if (str.equals("action.devices.commands.mediaSeekToPosition")) {
                    abax abaxVarJ = abauVar.j("absPositionMs");
                    if (abaxVarJ == null) {
                        return false;
                    }
                    Duration durationOfMillis = Duration.ofMillis(abaxVarJ.g());
                    durationOfMillis.getClass();
                    return this.b.c(durationOfMillis, false);
                }
                break;
            case -420317062:
                if (str.equals("action.devices.commands.mediaNext")) {
                    return this.b.a();
                }
                break;
            case -420153975:
                if (str.equals("action.devices.commands.mediaStop")) {
                    this.b.f();
                    return true;
                }
                break;
            case -143201969:
                if (str.equals("action.devices.commands.mediaPause")) {
                    this.b.d();
                    return true;
                }
                break;
            case -83398668:
                if (str.equals("action.devices.commands.mediaResume")) {
                    this.b.e();
                    return true;
                }
                break;
            case 520260862:
                if (str.equals("action.devices.commands.mediaPrevious")) {
                    return this.b.b();
                }
                break;
            case 1124248555:
                if (str.equals("action.devices.commands.mediaSeekRelative")) {
                    abax abaxVarJ2 = abauVar.j("relativePositionMs");
                    if (abaxVarJ2 == null) {
                        return false;
                    }
                    Duration durationOfMillis2 = Duration.ofMillis(abaxVarJ2.g());
                    durationOfMillis2.getClass();
                    return this.b.c(durationOfMillis2, true);
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported command: ".concat(str));
    }
}
