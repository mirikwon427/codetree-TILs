def solution(video_len, pos, op_start, op_end, commands):
    def time_to_sec(time_str):
        minutes, seconds = map(int, time_str.split(":"))
        return minutes * 60 + seconds

    def sec_to_time(total_sec):
        minutes, seconds = divmod(total_sec, 60)
        return f"{minutes:02}:{seconds:02}"

    def skip_intro(position):
        return op_end if op_start <= position <= op_end else position

    video_len, pos, op_start, op_end = map(time_to_sec, [video_len, pos, op_start, op_end])
    pos = skip_intro(pos)

    for command in commands:
        if command == "prev":
            pos = max(0, pos - 10)
        elif command == "next":
            pos = min(video_len, pos + 10)
        pos = skip_intro(pos)

    return sec_to_time(pos)