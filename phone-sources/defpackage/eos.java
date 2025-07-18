package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eos extends Exception {
    public eos(UUID uuid) {
        super("Media does not support uuid: ".concat(String.valueOf(String.valueOf(uuid))));
    }
}
