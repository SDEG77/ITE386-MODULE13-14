tasks = []

def add_task(task, date):
    tasks.append([task, date])
    
def run_scheduler():
    print("Schedule:")
    
    for task in tasks:
        print(f"{task[1]} - {task[0]}")

def main():
    add_task("hello", "Monday")
    add_task("world", "Tuesday")
    
    run_scheduler()
    
if  __name__ == "__main__":
    main()