package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ehm extends ehe {
    public boolean shouldBeSkipped;
    public int skippedOutputBufferCount;
    public long timeUs;

    @Override // defpackage.ehe
    public void clear() {
        super.clear();
        this.timeUs = 0L;
        this.skippedOutputBufferCount = 0;
        this.shouldBeSkipped = false;
    }

    public abstract void release();
}
