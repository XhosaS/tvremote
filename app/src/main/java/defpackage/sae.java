package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sae implements sab {
    private static final zdy a = zdy.h("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl");
    private static final List b = agqq.d(6, 1999);
    private final Context c;
    private final AudioManager d;
    private final boolean e;

    public sae(Context context, AudioManager audioManager, boolean z) {
        context.getClass();
        this.c = context;
        this.d = audioManager;
        this.e = z;
    }

    private final int b() throws Resources.NotFoundException {
        Context context = this.c;
        int identifier = context.getResources().getIdentifier("vr_input_device_channel_index_mask", "integer", context.getPackageName());
        if (identifier == 0) {
            return 3;
        }
        try {
            int integer = context.getResources().getInteger(identifier);
            ((zdv) a.b().o(zfi.a, "ALT.AecChecker").q("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl", "getChannelIndexMask", 80, "AecCheckerImpl.kt")).v("#audio# channel index mask(%d)", integer);
            return integer;
        } catch (Resources.NotFoundException unused) {
            return 3;
        }
    }

    private final String c() {
        Context context = this.c;
        int identifier = context.getResources().getIdentifier("vr_input_device_address", "string", context.getPackageName());
        if (identifier != 0) {
            try {
                return context.getResources().getString(identifier);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    private final boolean d() throws Resources.NotFoundException {
        Context context = this.c;
        int identifier = context.getResources().getIdentifier("aec_control_with_audiofx", "bool", context.getPackageName());
        if (identifier == 0) {
            return false;
        }
        try {
            boolean z = context.getResources().getBoolean(identifier);
            ((zdv) a.b().o(zfi.a, "ALT.AecChecker").q("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl", "mustEnableAecAudioFx", 94, "AecCheckerImpl.kt")).x("#audio# must enable aec with audiofx(%s)", Boolean.valueOf(z));
            return z;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    private final boolean e() throws Resources.NotFoundException {
        Context context = this.c;
        int identifier = context.getResources().getIdentifier("ns_control_with_audiofx", "bool", context.getPackageName());
        if (identifier == 0) {
            return false;
        }
        try {
            boolean z = context.getResources().getBoolean(identifier);
            ((zdv) a.b().o(zfi.a, "ALT.AecChecker").q("com/google/android/libraries/search/audio/aecchecker/impl/AecCheckerImpl", "mustEnableNsAudioFx", 108, "AecCheckerImpl.kt")).x("#audio# must enable ns with audiofx(%s)", Boolean.valueOf(z));
            return z;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.sab
    public final sad a(ruo ruoVar) {
        AudioDeviceInfo audioDeviceInfo;
        String strC;
        if (this.e && b.contains(Integer.valueOf(ruoVar.c)) && (strC = c()) != null) {
            AudioDeviceInfo[] devices = this.d.getDevices(1);
            devices.getClass();
            for (AudioDeviceInfo audioDeviceInfo2 : devices) {
                if (audioDeviceInfo2.getType() == 21 && agvy.c(audioDeviceInfo2.getAddress(), strC)) {
                    audioDeviceInfo = audioDeviceInfo2;
                    break;
                }
            }
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = null;
        }
        if (audioDeviceInfo == null) {
            return null;
        }
        String address = audioDeviceInfo.getAddress();
        address.getClass();
        return new sad(address, b(), d(), e(), audioDeviceInfo);
    }
}
