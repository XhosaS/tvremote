package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdl implements fds {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final fse g;
    private static final fse h;
    private ImmutableList c;
    private int f;
    private fjg e = new fjf(1);
    private boolean d = true;

    static {
        final int i = 1;
        g = new fse(new fdk() { // from class: fdj
            @Override // defpackage.fdk
            public final Constructor a() {
                if (i == 0) {
                    int i2 = fdl.a;
                    return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(fdp.class).getConstructor(null);
                }
                int i3 = fdl.a;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(fdp.class).getConstructor(Integer.TYPE);
                }
                return null;
            }
        });
        final int i2 = 0;
        h = new fse(new fdk() { // from class: fdj
            @Override // defpackage.fdk
            public final Constructor a() {
                if (i2 == 0) {
                    int i22 = fdl.a;
                    return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(fdp.class).getConstructor(null);
                }
                int i3 = fdl.a;
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(fdp.class).getConstructor(Integer.TYPE);
                }
                return null;
            }
        });
    }

    private final void e(int i, List list) {
        switch (i) {
            case 0:
                list.add(new flf());
                break;
            case 1:
                list.add(new flh());
                break;
            case 2:
                list.add(new flj(null));
                break;
            case 3:
                list.add(new fep(null));
                break;
            case 4:
                fdp fdpVarP = g.p(0);
                if (fdpVarP == null) {
                    list.add(new ffc(null));
                    break;
                } else {
                    list.add(fdpVarP);
                    break;
                }
            case 5:
                list.add(new ffe());
                break;
            case 6:
                list.add(new fhb(this.e, true == this.d ? 0 : 2));
                break;
            case 7:
                list.add(new fhg((byte[]) null));
                break;
            case 8:
                list.add(new fhw(this.e, true != this.d ? 32 : 0));
                list.add(new fhz(this.e, true != this.d ? 16 : 0));
                break;
            case 9:
                list.add(new fik());
                break;
            case 10:
                list.add(new fmi());
                break;
            case 11:
                if (this.c == null) {
                    this.c = ImmutableList.of();
                }
                list.add(new fmq(1, !this.d ? 1 : 0, this.e, new edo(0L), new zuw(0, this.c)));
                break;
            case 12:
                list.add(new fmw());
                break;
            case 14:
                list.add(new fez(this.f, 2));
                break;
            case 15:
                fdp fdpVarP2 = h.p(new Object[0]);
                if (fdpVarP2 != null) {
                    list.add(fdpVarP2);
                    break;
                }
                break;
            case 16:
                list.add(new fes(!this.d ? 1 : 0, this.e));
                break;
            case 17:
                list.add(new fez(3, (char[]) null));
                break;
            case 18:
                list.add(new ffj(2, (char[]) null));
                break;
            case 19:
                list.add(new fez(0));
                break;
            case 20:
                list.add(new ffj(0));
                break;
            case 21:
                list.add(new ffj(1, (byte[]) null));
                break;
        }
    }

    @Override // defpackage.fds
    public final synchronized fdp[] a(Uri uri, Map map) {
        ArrayList arrayList;
        arrayList = new ArrayList(21);
        int iK = dvb.k(map);
        if (iK != -1) {
            e(iK, arrayList);
        }
        int iL = dvb.l(uri);
        if (iL != -1 && iL != iK) {
            e(iL, arrayList);
        }
        int[] iArr = b;
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != iK && i2 != iL) {
                e(i2, arrayList);
            }
        }
        return (fdp[]) arrayList.toArray(new fdp[arrayList.size()]);
    }

    @Deprecated
    public final synchronized void b(boolean z) {
        this.d = z;
    }

    public final synchronized void c() {
        this.f = 1;
    }

    public final synchronized void d(fjg fjgVar) {
        this.e = fjgVar;
    }
}
