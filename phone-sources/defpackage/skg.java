package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skg extends skj implements sjw, sjv, skd {
    private final FileOutputStream a;
    private final File b;

    public skg(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.sjv
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.skd
    public final void b() throws SyncFailedException {
        this.a.getFD().sync();
    }

    @Override // defpackage.sjw
    public final File c() {
        return this.b;
    }
}
