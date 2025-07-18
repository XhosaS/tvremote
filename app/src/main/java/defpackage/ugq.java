package defpackage;

import android.net.Uri;
import j$.nio.channels.DesugarChannels;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugq implements jti {
    public final uee a;
    public final Uri b;
    public final ugs c;
    public final ueg d;
    public final Executor e;
    public final zwv f = new zwv();

    public ugq(uee ueeVar, ugs ugsVar, Executor executor) {
        this.a = ueeVar;
        this.b = ueeVar.e;
        this.c = ugsVar;
        this.d = ueeVar.a;
        this.e = executor;
    }

    @Override // defpackage.jti
    public final zyd a() {
        return this.f.b(new zvh() { // from class: ugn
            @Override // defpackage.zvh
            public final zyd a() {
                final ugq ugqVar = this.a;
                return zuz.h(ugqVar.c.a(ugqVar.b), wyo.c(new zvi() { // from class: ugm
                    @Override // defpackage.zvi
                    public final zyd a(Object obj) {
                        ugq ugqVar2 = ugqVar;
                        try {
                            ugqVar2.d.f(ugqVar2.b);
                            return zxy.a;
                        } catch (IOException e) {
                            return zxn.g(e);
                        }
                    }
                }), ugqVar.e);
            }
        }, this.e);
    }

    @Override // defpackage.jti
    public final zyd b() {
        return this.f.a(new Callable() { // from class: ugi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ugq ugqVar = this.a;
                return Long.valueOf(ugqVar.d.a(ugqVar.b));
            }
        }, this.e);
    }

    @Override // defpackage.jti
    public final zyd c(final long j, final jtk jtkVar) {
        return zuz.h(b(), wyo.c(new zvi() { // from class: ugo
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final long j2 = j;
                Long l = (Long) obj;
                boolean z = false;
                if (j2 >= 0 && j2 <= l.longValue()) {
                    z = true;
                }
                final jtk jtkVar2 = jtkVar;
                final ugq ugqVar = this.a;
                yqw.H(z, "Offset for write (%s) out of range of existing file size (%s bytes)", j2, l);
                return ugqVar.f.b(new zvh() { // from class: ugh
                    @Override // defpackage.zvh
                    public final zyd a() {
                        final ugq ugqVar2 = ugqVar;
                        final Uri uri = ugqVar2.b;
                        final jtk jtkVar3 = jtkVar2;
                        yqi yqiVar = new yqi() { // from class: ugt
                            @Override // defpackage.yqi
                            public final Object apply(Object obj2) {
                                return ugw.b((plu) obj2, uri, yqt.i(jtkVar3));
                            }
                        };
                        ugw ugwVar = (ugw) ugqVar2.c;
                        qfr qfrVarC = qfr.c(ugwVar.a.a(yqiVar, ugwVar.b));
                        final long j3 = j2;
                        return qfrVarC.g(new zvi() { // from class: ugk
                            @Override // defpackage.zvi
                            public final zyd a(Object obj2) {
                                ugq ugqVar3 = ugqVar2;
                                long j4 = j3;
                                try {
                                    ufv ufvVar = new ufv((RandomAccessFile) ugqVar3.d.c(ugqVar3.b, new uhf()));
                                    try {
                                        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((RandomAccessFile) ufvVar.a).getChannel());
                                        fileChannelConvertMaybeLegacyFileChannelFromLibrary.position(j4);
                                        List listA = ugqVar3.a.a(Channels.newOutputStream(fileChannelConvertMaybeLegacyFileChannelFromLibrary));
                                        ufvVar.a = null;
                                        zyd zydVarH = zxn.h(Channels.newChannel((OutputStream) listA.get(0)));
                                        ufvVar.close();
                                        return zydVarH;
                                    } finally {
                                    }
                                } catch (IOException e) {
                                    return zxn.g(e);
                                }
                            }
                        }, ugqVar2.e);
                    }
                }, ugqVar.e);
            }
        }), this.e);
    }

    @Override // defpackage.jti
    public final zyd d() {
        return this.f.b(new zvh() { // from class: ugp
            @Override // defpackage.zvh
            public final zyd a() {
                ugq ugqVar = this.a;
                ugw ugwVar = (ugw) ugqVar.c;
                zyd zydVarC = ugwVar.a.c();
                final Uri uri = ugqVar.b;
                return zuz.g(zuz.g(zydVarC, wyo.a(new yqi() { // from class: ugu
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        return ugw.c((plu) obj, uri);
                    }
                }), ugwVar.b), wyo.a(new yqi() { // from class: ugj
                    @Override // defpackage.yqi
                    public final Object apply(Object obj) {
                        return (jtk) ((yqt) obj).d(new yrp() { // from class: ugl
                            @Override // defpackage.yrp
                            public final Object eV() {
                                return new jsq("", 0L);
                            }
                        });
                    }
                }), ugqVar.e);
            }
        }, this.e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ugq) {
            return this.b.equals(((ugq) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
