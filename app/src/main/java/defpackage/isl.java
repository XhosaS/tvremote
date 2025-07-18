package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class isl implements isp {
    private final gxt a;
    private final Set b = agqj.p(new String[]{"action.devices.commands.setVolume", "action.devices.commands.mute", "action.devices.commands.volumeRelative"});

    public isl(gxt gxtVar) {
        this.a = gxtVar;
    }

    @Override // defpackage.isp
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.isp
    public final boolean b(String str, abau abauVar) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1890068065) {
            if (str.equals("action.devices.commands.setVolume")) {
                if (abauVar.g("volumeLevel") == null) {
                    return false;
                }
                gxt gxtVar = this.a;
                if (gxtVar.f() == fnj.SOFTWARE) {
                    gxtVar.i(abauVar.g("volumeLevel").a(), 1);
                }
                return true;
            }
            throw new IllegalArgumentException("Unsupported command: ".concat(str));
        }
        if (iHashCode != -890721693) {
            if (iHashCode == -446017354 && str.equals("action.devices.commands.mute")) {
                if (abauVar.g("mute") == null) {
                    return false;
                }
                gxt gxtVar2 = this.a;
                if (gxtVar2.f() != fnj.IR) {
                    gxtVar2.h(abauVar.g("mute").e(), 1);
                }
                return true;
            }
            throw new IllegalArgumentException("Unsupported command: ".concat(str));
        }
        if (str.equals("action.devices.commands.volumeRelative")) {
            if (abauVar.g("relativeSteps") == null) {
                return false;
            }
            gxt gxtVar3 = this.a;
            if (gxtVar3.f() != fnj.IR) {
                gxtVar3.g(abauVar.g("relativeSteps").a() * (gxtVar3.a() / gxtVar3.e()));
            }
            return true;
        }
        throw new IllegalArgumentException("Unsupported command: ".concat(str));
    }
}
