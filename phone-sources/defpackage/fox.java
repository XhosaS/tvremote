package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fox implements fpg {
    public final /* synthetic */ fph a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ fox(fph fphVar, int i, int i2) {
        this.c = i2;
        this.a = fphVar;
        this.b = i;
    }

    @Override // defpackage.fpg
    public final void a(fnw fnwVar) {
        boolean z = false;
        i = 0;
        i = 0;
        int i = 0;
        z = false;
        if (this.c == 0) {
            fqt fqtVar = this.a.b.q;
            int i2 = fnm.a;
            int i3 = this.b;
            if (i3 != -1 && i3 != 0) {
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalArgumentException("Unrecognized ShuffleMode: " + i3);
                }
                z = true;
            }
            fqtVar.ae(z);
            return;
        }
        fqt fqtVar2 = this.a.b.q;
        int i4 = fnm.a;
        int i5 = this.b;
        if (i5 != -1 && i5 != 0) {
            if (i5 == 1) {
                i = 1;
            } else if (i5 == 2 || i5 == 3) {
                i = 2;
            } else {
                edb.e("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i5 + " was converted to `Player.REPEAT_MODE_OFF`");
            }
        }
        fqtVar2.ad(i);
    }
}
