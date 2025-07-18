package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iir extends ggi {
    public iir() {
        super(24, 25);
    }

    @Override // defpackage.ggi
    public final void a(ghk ghkVar) {
        ghkVar.f("\n       CREATE TABLE `last_watched_item` (\n            `account_name` TEXT NOT NULL,\n            `show_id` TEXT NOT NULL,\n            `last_watched_episode_id` TEXT NOT NULL,\n            PRIMARY KEY(`account_name`, `show_id`)\n            )\n            ");
    }
}
