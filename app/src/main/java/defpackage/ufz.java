package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ufz extends ugd implements uff, ufe, ufw {
    private final FileOutputStream a;
    private final File b;

    public ufz(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.ufe
    public final FileChannel a() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.ufw
    public final void b() throws SyncFailedException {
        this.a.getFD().sync();
    }

    @Override // defpackage.uff
    public final File c() {
        return this.b;
    }
}
